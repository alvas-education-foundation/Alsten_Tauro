# include<stdio.h> 
# include<stdlib.h> 
int maxDivide(int a, int b) 
{ 
  while (a%b == 0) 
   a = a/b;  
  return a; 
}     
int isUgly(int no) 
{ 
  no = maxDivide(no, 2); 
  no = maxDivide(no, 3); 
  no = maxDivide(no, 5); 
  return (no == 1)? 1 : 0; 
}     
int getNthUglyNo(int n) 
{ 
  int i = 1;  
  int count = 1; 
  while (n > count) 
  { 
    i++;       
    if (isUgly(i)) 
      count++;  
  } 
  return i; 
} 
int main() 
{ 
    int n,i;
    printf("Enter the range :");
    scanf("%d",&n);
    printf("The ugly numbers are :");
    for(i=1;i<=n;i++)
    {
    unsigned no = getNthUglyNo(i); 
    printf("%d ",  no); 
    }
    return 0; 
}