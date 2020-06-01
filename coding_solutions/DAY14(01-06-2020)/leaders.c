#include <stdio.h>

int main()
{
    int i,t,arr[100],max[100],j=0;
    printf("Enter size of array :");
    scanf("%d",&t);
    printf("Enter elements of array :");
    for(i=0; i<t ;i++)
    {
        scanf("%d",&arr[i]);
        max[i]=0;
    }
    max[j++] = arr[t-1];
    for(i=t-1; i>=0; i=i-1)
        if( arr[i] >= max[j-1] )
        {
            max[j] = arr[i];
            j++;
        }
         printf("Leaaders are :");
    for(j=j-1; j>0; j=j-1)
        printf("%d\n",max[j]);
    return 0;
}