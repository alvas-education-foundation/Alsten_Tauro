
####### Write a simple Python program to implement Diffie–Hellman Key Exchange Example #######



p=int(input("Enter p value :"));
g=int(input("Enter g value :"));
x=int(input("enter private key of A :"));
y=int(input("enter private key of B :"));
sendA = (g**x)%p
sendB = (g**y)%p
ComputeA = (sendB**x)%p
ComputeB = (sendA**y) %p
sendB = (g**y)%p
ComputeB = (sendA**y) %p
print ("A secret key:   ", ComputeB )
print ("B secret key: ", ComputeA)