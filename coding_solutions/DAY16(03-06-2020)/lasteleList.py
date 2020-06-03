n=int(input("Enter a list size :"))
a=[]
print("Enter list elements:")
for i in range(0,n):
    b=(input())
    a.append(b)
for i in range(0,n):
    print(a[-1])