#include <stdlib.h>
 
struct node{
 int val;
 struct node *next;
};
 
void print_list(struct node *head)
{
 printf("H->");
 
 while(head)
 {
  printf("%d->", head->val);
  head = head->next;
 }
 
 printf("Null\n");
}
 
void insert_front(struct node **head, int value)
{
 struct node * new_node = NULL;
 
 new_node = (struct node *)malloc(sizeof(struct node));
 
 if (new_node == NULL)
 {
  printf("Failed to insert element. Out of memory");
 }
 
 new_node->val = value;
 new_node->next = *head;
 
 *head = new_node;
}
 
void delete_node(struct node **head, struct node *node)
{
 struct node *tmp = NULL;
 
 if (head == NULL || *head == NULL) return;
 
 if(*head == node)
 {
  *head = (*head)->next;
  free(node);
  return;
 }
 
 tmp = *head;
 
 while(tmp->next && tmp->next != node) tmp = tmp->next;
 
 if(tmp->next)
 {
  tmp->next = tmp->next->next;
  free(node);
 }
 else
 {
  printf("Node not found in the list.\n");
 }
}
 
void remove_duplicate(struct node *head)
{
 struct node *tmp = NULL;
 struct node *tmp1 = NULL;
 struct node *tmp2 = NULL;
 
 if (head == NULL) return;
 
 tmp = head;
 while(tmp)
 {
  tmp1 = tmp->next;
 
  while(tmp1)
  {
    tmp2 = tmp1;
    tmp1 = tmp1->next;
 
    if(tmp->val == tmp2->val) delete_node(&head, tmp2);
  }
 
  tmp = tmp->next;
 }
}
void main()
{
 int count = 0, i, val;
 struct node * head = NULL;
 printf("Enter number of elements: ");
 scanf("%d", &count);
 for (i = 0; i < count; i++)
 {
  printf("Enter %dth element: ", i);
  scanf("%d", &val);
  insert_front(&head, val);
 }
 printf("Initial List: ");
 print_list(head);
 remove_duplicate(head);
 printf("List after removing duplicate entries: ");
 print_list(head);
}