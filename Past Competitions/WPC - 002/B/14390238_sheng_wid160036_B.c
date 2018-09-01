# -*- coding: utf-8 -*-
import math


def main():
	txt_in = []
	while True:
		try:
			a = int(input(), 2)
			b = int(input(), 2)
			txt_in.append((a, b))
			input()
		except:
			break
	txt_out = [None] * len(txt_in)
	i = 0
	for a, b in txt_in:
		txt_out[i] = bin2fib(a) + bin2fib(b)
		i += 1
	for i in range(len(txt_out)):
		print(bin(fib2bin(txt_out[i]))[2:], end="\n")
		if i != len(txt_out) - 1:
			print()

def f(n):
	return int(math.log(n * math.sqrt(5) + 10 ** -6) / math.log(PHI)) + 1


def bin2fib(n):
	s = 0
	i = 0
	while n > 0:
		if n & 1:
			s += MEM[i]
		n //= 2
		i += 1
	return s

def fib2bin(n):
	i = f(n)
	s = []
	while n != 0 and i >= 0:
		if MEM[i] <= n:
			n -= MEM[i]
			s.append(i)
		i -= 1
	g = 0
	for k in s:
		g += 1 << k
	return g

if __name__ == '__main__':
	MEM = [None] * 110
	MEM[0] = 1
	MEM[1] = 2

	for i in range(2, 110):
		MEM[i] = MEM[i - 1] + MEM[i - 2]

	PHI = (1 + math.sqrt(5)) / 2
	main()