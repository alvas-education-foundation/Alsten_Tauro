#include <stdio.h>    
int main()    
{    
    int arr[10],i,n,length;    
    printf("Enter array size :");
    scanf("%d",&length);
    printf("Enter th elements :");
    for (i=0;i<length;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Enter value to rotate :");
    scanf("%d",&n);
    printf("Original array: \n");    
    for (int i = 0; i < length; i++) {    
        printf("%d ", arr[i]);    
    }    
    for(int i = 0; i < n; i++){    
        int j, last;    
        last = arr[length-1];    
       
        for(j = length-1; j > 0; j--){    
            arr[j] = arr[j-1];    
        }    
        arr[0] = last;    
    }    
    printf("\n");    
    printf("Array after right rotation: \n");    
    for(int i = 0; i< length; i++){    
        printf("%d ", arr[i]);    
    }    
    return 0;    
}
