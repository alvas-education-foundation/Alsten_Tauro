a=[]
n=int(input("Enter list size:"))
for i in range(0,n):
    b=int(input())
    a.append(b)
for n in a:
    if n%2!=0:
        print(n*n,end=" ")
        
    
