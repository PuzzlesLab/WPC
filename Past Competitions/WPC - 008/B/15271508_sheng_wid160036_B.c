import math
import sys

def is_prime(n):
	if n < 2:
		return False
	if n == 2:
		return True
	if n % 2 == 0:
		return False
	for k in range(3, int(math.sqrt(n)) + 1, 2):
		if n % k == 0:
			return False
	return True

def main():
	x = sys.stdin.read().strip().split("\n")
	x.pop()

	x = [int(k) for k in x]

	prime = []
	for k in range(2, max(x)):
		if is_prime(k):
			prime.append(k)

	for k in x:
		i = 0
		c = prime[i]
		flag = False
		while c <= k // 2:
			if is_prime(k - c):
				print("%d = %d + %d" % (k, c, k - c))
				flag = True
				break
			i += 1
			c = prime[i]
		if not flag:
			print("Goldbach's conjecture is wrong.")

if __name__ == '__main__':
	main()