#include <bits/stdc++.h> 
using namespace std; 
bool difSquare(int n) 
{ 
    if (n % 4 != 2) { 
        return true; 
    } 
    return false; 
} 
int main() 
{ 
    int n;
    cout<<"Enter the number :";
    cin>>n;
    if (difSquare(n)) { 
        cout << "Yes\n"; 
    } 
    else { 
        cout << "No\n"; 
    } 
    return 0; 
}