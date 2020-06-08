def palindrome():
    str1=input("Enter a string:")
    if(str1==str1[::-1]):
        print("True")
    else:
        print("False")
palindrome()