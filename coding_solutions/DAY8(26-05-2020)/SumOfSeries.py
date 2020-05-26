num = int(input('Enter n: '))
print ((num*(num+1))//2)

sum(range(1,num+1))


total_sum =0
for i in range(1,num):
    total_sum+=i
    print(i,end='+')
print(num,'=', total_sum+num, sep='')
