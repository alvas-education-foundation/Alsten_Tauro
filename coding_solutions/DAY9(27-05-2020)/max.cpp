#include <bits/stdc++.h> 
using namespace std; 
void findMaximumBefore(int arr[], int n){ 
    for (int i = 0; i < n; i++) { 
        int currAns = -1;
        for (int j = i - 1; j >= 0; j--) { 
            if (arr[j] > currAns && 
                   arr[j] < arr[i]) { 
                currAns = arr[j]; 
            } 
        } 
        cout << currAns << " "; 
    } 
} 
int main() 
{ 
    int arr[10],i,n;
    cout<<"enter size of array :";
    cin>>n;
    cout<<"Enter elements :";
    for(i=0;i<n;i++)
    cin>>arr[i];
    findMaximumBefore(arr, n); 
}