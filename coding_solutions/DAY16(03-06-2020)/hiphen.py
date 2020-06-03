#Python Program to Accept a Hyphen Separated Sequence of Words as Input and Print the Words in a Hyphen-Separated Sequence after Sorting them Alphabetically#
print("Enter a hyphen separated sequence of words:")
lst=[n for n in input().split('-')]  
lst.sort()
print("Sorted:")
print('-'.join(lst))
