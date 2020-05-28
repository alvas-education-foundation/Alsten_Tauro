num = input("Enter a number: ")
def diroot(num):
    if len(num) == 1:
        return num
    else:
        sum = 0
        for i in num:
            sum += int(i)
        num = str(sum)
        return diroot(num)
print("The digital root of ", num, "is: ", diroot(num))