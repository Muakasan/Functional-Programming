#Aidan San
#muakasan@gmail.com
#https://github.com/Muakasan/Functional-Programming

from itertools import *

def myMap(f, l):
	return []

def myFilter(f, l):
	return []

def isPrime(n):
	return True

def main():
	l = [60, 36, 20, 8, 43, 75, 15, 42, 87, 48, 68, 4, 82, 41, 44]

	print("The list where each element is multiplied by 2:")
	print(map(lambda x: 2*x, l))
	
	print("The list where each element has 1 added to it:")
	print([])

	print("The list with only elements greater than 40:")
	print(filter(lambda x: x > 40, l))
	
	print("The list with only even elements:")
	print([])
	
	print("The sum of the list:")
	print(reduce(lambda a, x: a + x, l))
	
	print("The max of the list:")
	print(0)

	print("The list where each element is multiplied by 2 using YOUR map:")
	print(myMap(lambda x: 2*x, l))

	print("The list with only elements greater than 40 using YOUR filter:")
	print(myFilter(lambda x: x > 40, l))

	print("The first 20 prime numbers:")
	print([])

if __name__ == "__main__":
	main()	
