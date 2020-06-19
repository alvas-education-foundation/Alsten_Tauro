#include <stdio.h>

int main(void) {
unsigned int n,i,c=0;
printf("Enter n value :");
scanf("%d",&n);
for(i=1;i<=n;i++)
{
unsigned int a=i;
while(a)
{
c=c+(a&1);
a>>=1;
}
}
printf("%d",c);

return 0;
}