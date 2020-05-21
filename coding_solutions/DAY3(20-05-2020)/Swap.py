####### Write a simple Python program to swap a number using xor(^) #######


x=int(input('Enter X value :'))
y=int(input('Enter Y value :'))
x=x^y
y=x^y
x=x^y
print('After Swapping X = ',x)
print('After Swapping Y = ',y)
