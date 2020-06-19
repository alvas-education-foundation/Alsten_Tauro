#include<stdio.h>
int main()
{
 int choice;
 int matrix[100][100];
            int m,n,i,j;
 while(1)
 {
     printf("1.clockwise rotation\n");
 printf("2.anticlockwise\n");
 printf("3.exit\n");
 printf("enter the choice :");
 scanf("%d",&choice);
 switch(choice)
 {
     case 1:
            printf("Enter row and columns of matrix: ");
            scanf("%d%d",&m,&n);
            printf("Enter matrix elements: \n");
             for(i=0;i<m;i++)
             {
            for(j=0;j<n;j++)
                {
                 scanf("%d",&matrix[i][j]);
                     }
                    }
                 printf("Matrix after 90 degrees clockwise  rotation \n");
                 for(i=0;i<n;i++)
                    {
                  for(j=m-1;j>=0;j--)
                 {
                  printf("%d  ",matrix[j][i]);
                 }
             printf("\n");
                 }break;
     case 2:printf("Enter row and columns of matrix: ");
            scanf("%d%d",&m,&n);
            printf("Enter matrix elements: \n");
             for(i=0;i<m;i++)
             {
            for(j=0;j<n;j++)
                {
                 scanf("%d",&matrix[i][j]);
                     }
                    }
                 printf("Matrix after 90 degrees anticlockwise rotation \n");
                for(i=n-1;i>=0;i--)
                 {
                  for(j=0;j<m;j++)
                 {
                  printf("%d  ",matrix[j][i]);
                 }
             printf("\n");
                 }break; 
     case 3:exit(0);             
 }
 }
 return 0;
}