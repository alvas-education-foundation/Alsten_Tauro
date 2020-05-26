#include <bits/stdc++.h> 
using namespace std; 
void cntArray(int A[], int N) 
{ 
    int result = 0; 
    for (int i = 0; i < N; i++) { 
        result++; 
        int current_value = A[i]; 
        for (int j = i + 1; j < N; j++) { 
            if (A[j] == current_value) { 
                result++; 
            } 
        } 
    } 
    cout << result << endl; 
} 
int main() 
{ 
    int A[10],N,i;
    cout<<"Enter size of array :";
    cin>>N;
    cout<<"Enter elements :";
    for(i=0;i<N;i++)
    cin>>A[i]; 
   cout<<"Total no of subarrays is :";
    cntArray(A, N); 
  
    return 0; 
}