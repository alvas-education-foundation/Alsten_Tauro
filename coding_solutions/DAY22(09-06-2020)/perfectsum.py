
def sumSubsets(sets, n, target) : 

	
	x = [0]*len(sets); 
	j = len(sets) - 1; 


	while (n > 0) : 
	
		x[j] = n % 2; 
		n = n // 2; 
		j -= 1; 
	
	sum = 0; 

	
	for i in range(len(sets)) : 
		if (x[i] == 1) : 
			sum += sets[i]; 

 
	if (sum == target) : 

		print("{",end=""); 
		for i in range(len(sets)) : 
			if (x[i] == 1) : 
				print(sets[i],end= ", "); 
		print("}, ",end=""); 


def findSubsets(arr, K) : 

	 
	x = pow(2, len(arr)); 


	for i in range(1, x) : 
		sumSubsets(arr, i, K); 

 
if __name__ == "__main__" : 

	arr = [ 5, 10, 12, 13, 15, 18 ]; 
	K = 30; 
	findSubsets(arr, K); 


