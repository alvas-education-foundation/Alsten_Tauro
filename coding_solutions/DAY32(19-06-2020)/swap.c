#include <stdio.h>
int swap(int x,int y);
int main()
{
   int x, y;

   printf("Enter the value of x and y\n");
   scanf("%d%d", &x, &y);
   printf("After Swapping");
   swap(x,y);
   
}
int swap(int x,int y)
{
    int *a,*b,temp;
   a = &x;
   b = &y;
   
   temp = *b;
   *b   = *a;
   *a   = temp;
      printf("\nx = %d\ny = %d\n", x, y);
   return 0;
}