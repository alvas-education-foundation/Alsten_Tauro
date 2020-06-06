from math import log, ceil 
  
def CRC(dataword, generator): 
    dword = int(dataword, 2) 
    l_gen = len(generator)
    dividend = dword << (l_gen - 1) 
    shft = ceil(log(dividend + 1, 2)) - l_gen  
    generator = int(generator, 2) 
  
    while dividend >= generator or shft >= 0:
        rem = (dividend >> shft) ^ generator     
        dividend = (dividend & ((1 << shft) - 1)) | (rem << shft)
        shft = ceil(log(dividend+1, 2)) - l_gen 
    codeword = dword << (l_gen-1)|dividend 
    print("Remainder:", bin(dividend).lstrip("-0b")) 
    print("Codeword :", bin(codeword).lstrip("-0b")) 
dataword = str(input("Enter the dataword:"))
generator = str(input("Enter the generator:"))
CRC(dataword, generator)