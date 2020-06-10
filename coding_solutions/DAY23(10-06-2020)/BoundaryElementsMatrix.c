#include<stdio.h>
int main (){
 int arr[100][100],sum = 0,row,col;
 printf("Enter Row and Col: ");
 scanf("%d%d",&row,&col);
  printf("Enter elements :");
 for(int i = 0; i < row; i++){
  for(int j = 0; j < col; j++){
   scanf("%d",&arr[i][j]);
  }
 }
 for(int i = 0; i < row; i++){
  for(int j = 0; j < col; j++){
   if(i == 0 || j == 0 || i == row-1 || j == col-1){
    sum+=arr[i][j];
   }
  }
 }
 printf("Sum of boundary is: %d",sum);
 return 0;
}