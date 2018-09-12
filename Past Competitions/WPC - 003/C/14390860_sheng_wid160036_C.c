# -*- coding: utf-8 -*-
import sys


def gcd(a, b):
	if b > a:
		return gcd(b, a)
	if b == 0:
		return a
	return gcd(b, a % b)


def main():
	txt_in = sys.stdin.readlines()
	txt_in = txt_in[1:]
	txt_in = [(int(txt_in[i], 2), int(txt_in[i + 1], 2)) for i in range(0, len(txt_in), 2)]
	txt_out = []
	res1 = "All you need is love!"
	res2 = "Love is not all you need!"
	for i, k in enumerate(txt_in):
		if gcd(k[0], k[1]) > 1:
			print("Pair #{}: {}".format(i + 1, res1))
		else:
			print("Pair #{}: {}".format(i + 1, res2))

if __name__ == '__main__':
	main()