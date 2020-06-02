a =list(input("Enter list elements :").split()) 
print ("The original list is : " + str(a)) 
res = a[::len(a)-1] 
print ("The first and last element of list are : " + str(res)) 
