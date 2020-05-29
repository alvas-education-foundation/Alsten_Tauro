##Program to calculate number of uppercase and lowercase letters in a string###

string=input("Enter a string : ")
count1=0
count2=0
for i in string:
    if (i.isupper()):
        count1=count1+1
    elif(i.islower()):
        count2=count2+1
print("Upper case characters :",count1)
print("Lowe case characters : ",count2)
