#include<stdio.h>
#include<stdlib.h>
struct Node;
typedef struct Node * PtrToNode;
typedef PtrToNode List;
typedef PtrToNode Position;
 
struct Node
{
    int e;
    Position next;
};
 
void Insert(int x, List l, Position p)
{
    Position TmpCell;
    TmpCell = (struct Node*) malloc(sizeof(struct Node));
    if(TmpCell == NULL)
        printf("Memory out of space\n");
    else
    {
        TmpCell->e = x;
        TmpCell->next = p->next;
        p->next = TmpCell;
    }
}
 
int isLast(Position p)
{
    return (p->next == NULL);
}
 
Position FindPrevious(int x, List l)
{
    Position p = l;
    while(p->next != NULL && p->next->e != x)
        p = p->next;
    return p;
}
 
void Delete(int x, List l)
{
    Position p, TmpCell;
    p = FindPrevious(x, l);
 
    if(!isLast(p))
    {
        TmpCell = p->next;
        p->next = TmpCell->next;
        free(TmpCell);
    }
    else
        printf("Element does not exist!!!\n");
}
 
void Display(List l)
{
    printf("The list element are :: ");
    Position p = l->next;
    while(p != NULL)
    {
        printf("%d -> ", p->e);
        p = p->next;
    }
}

 
int main()
{
    int x, pos, ch, i;
    List l, l1;
    l = (struct Node *) malloc(sizeof(struct Node));
    l->next = NULL;
    List p = l;
    printf("LINKED LIST IMPLEMENTATION OF LIST ADT\n");
    do
    {
        printf("\n1. INSERT\n 2. DELETE\n 3. PRINT\n 4. QUIT\n\nEnter the choice :: ");
        scanf("%d", &ch);
        switch(ch)
        {
        case 1:
            p =l;
            printf("Enter the element to be inserted :: ");
            scanf("%d",&x);
            printf("Enter the position of the element :: ");
            scanf("%d",&pos);
 
            for(i = 1; i < pos; i++)
            {  // p=p->;
                p = p->next;
                //p->next=next->NULL;
            }
            Insert(x,l,p);
            break;
 
        case 2:
            p = l;
            printf("Enter the element to be deleted :: ");
            scanf("%d",&x);
            Delete(x,p);
            break;
 
        case 3:
            Display(l);
            break;
        }
    }
    while(ch<4);
    return 0;
}