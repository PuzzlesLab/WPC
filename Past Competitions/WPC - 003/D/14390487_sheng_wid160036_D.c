# -*- coding: utf-8 -*-
import re
import sys


def C(n, k):
	if k == 0:
		return 1
	elif k < 2:
		return n
	else:
		return n * C(n - 1, k - 1) // k


def main():
	txt_in = sys.stdin.readlines()
	txt_in = txt_in[1:]
	dat = []
	a, b, n = [None] * 3
	for k in txt_in:
		a, b = k.split("+")
		a = a[1:]
		b, n = b.split(")^")
		n = int(n)
		dat.append((a, b, n))
	k = 1
	for a, b, n in dat:
		print("Case {}: ".format(k), end="")
		k += 1
		if n == 1:
			print("{}+{}".format(a, b))
			continue
		for i in range(n + 1):
			if i == 0:
				print("{}^{}".format(a, n), end="")
			elif i == n:
				print("+{}^{}".format(b, n), end="")
			else:
				if i == 1 and n - i == 1:
					print("+{}*{}*{}".format(C(n, i), a, b), end="")
				elif i == 1:
					print("+{}*{}^{}*{}".format(C(n, i), a, n - i, b), end="")
				elif n - i == 1:
					print("+{}*{}*{}^{}".format(C(n, i), a, b, i), end="")
				else:
					print("+{}*{}^{}*{}^{}".format(C(n, i), a, n - i, b, i), end="")
		print()


if __name__ == '__main__':
	main()