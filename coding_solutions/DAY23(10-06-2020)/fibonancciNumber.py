import math
def checkPerfectSquare(n):
    sqrt = int(math.sqrt(n))
    if pow(sqrt, 2) == n:
        return True
    else:
        return False
def isFibonacciNumber(n):
    res1 = 5 * n * n + 4
    res2 = 5 * n * n - 4
    if checkPerfectSquare(res1) or checkPerfectSquare(res2):
        return True
    else:
        return False
num = int(input("Enter a number: "))
if isFibonacciNumber(num):
    print (num, "is a Fibonacci number")
else:
    print (num, "is not a Fibonacci number")