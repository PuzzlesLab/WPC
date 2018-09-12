# -*- coding: utf-8 -*-
import sys

def main():
	txt_in = sys.stdin.readlines()
	txt_in = [[int(x) for x in k.split()] for k in txt_in]
	for a, b in txt_in:
		s = [a*i for i in range(b)]
		s = [k % b for k in s]
		print("{:>10d}{:>10d}    ".format(a, b), end="")
		if len(set(s)) == b:
			print("Good Choice")
		else:
			print("Bad Choice")
		print()
		


if __name__ == '__main__':
	main()