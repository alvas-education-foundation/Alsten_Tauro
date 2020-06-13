#include <stdio.h>
int main()
{
    int units;
    float amt, total_amt, sur_charge;
    printf("Enter total units consumed: ");
    scanf("%d", &units);
     if (units <= 100) { 
            amt= units * 10; 
        } 
        else if (units <= 200) { 
            amt= (100 * 10)  + (units - 100) * 15; 
        } 
        else if (units <= 300) { 
            amt= (100 * 10)  + (100 * 15) + (units - 200) * 20; 
        } 
        else if (units > 300) { 
            amt= (100 * 10)+ (100 * 15) + (100 * 20) + (units - 300) * 25; 
        } 
    total_amt  = amt;
    printf("Electricity Bill = Rs. %.2f", total_amt);
    return 0;
}