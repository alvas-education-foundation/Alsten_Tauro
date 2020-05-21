
import math
def isprimebad(n) :
 if n > 1:
    for i in range(2, n):
        if (n % i) == 0:
            return(False)
            break
    else:
        return(True)
 else:
    return(False)
for i in range(1,50) :
 print(i,'==>',isprimebad(i))