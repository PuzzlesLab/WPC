# -*- coding: utf-8 -*-
import sys
import math

def solve(n):
	L, x = (0, 1)
	while not x < 1:
		x = abs(1 - n / (math.e ** L))
		L = L + 1
	return (L - 1, 1 - n / (math.e ** (L - 1)))


def main():
	n = sys.stdin.read().split("\n")
	n = [int(k) for k in n if k != ""]
	n.pop()

	print("\n".join(["{} {:.8f}".format(*solve(k)) for k in n]))

if __name__ == '__main__':
	main()