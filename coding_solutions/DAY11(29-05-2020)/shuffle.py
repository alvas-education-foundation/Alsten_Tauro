def isInterleaved(A, B, C):  
    M = len(A) 
    N = len(B)  
    IL = [[False] * (N + 1) for i in range(M + 1)]  
    if ((M + N) != len(C)):  
        return False
    for i in range(0, M + 1):  
        for j in range(0, N + 1): 
            if (i == 0 and j == 0):  
                IL[i][j] = True
            elif (i == 0):  
                if (B[j - 1] == C[j - 1]):  
                    IL[i][j] = IL[i][j - 1]  
            elif (j == 0):  
                if (A[i - 1] == C[i - 1]):  
                    IL[i][j] = IL[i - 1][j]  
            elif (A[i - 1] == C[i + j - 1] and
                  B[j - 1] != C[i + j - 1]):  
                IL[i][j] = IL[i - 1][j]  
            elif (A[i - 1] != C[i + j - 1] and 
                  B[j - 1] == C[i + j - 1]):  
                IL[i][j] = IL[i][j - 1]  
            elif (A[i - 1] == C[i + j - 1] and 
                  B[j - 1] == C[i + j - 1]):  
                IL[i][j] = (IL[i - 1][j] or IL[i][j - 1])  
          
    return IL[M][N]  
def test(A, B, C):  
  
    if (isInterleaved(A, B, C)):  
        print(C,"is a valid shuffle")  
    else: 
        print(C, "is not a valid shuffle") 
if _name_ == '_main_': 
    a=input("enter a string1 :")
    b=input("enter a string2 :")
    c=input("enter a string3 :")
    test(a,b,c)