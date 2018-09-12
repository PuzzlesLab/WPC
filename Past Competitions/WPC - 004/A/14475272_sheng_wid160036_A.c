# -*- coding: utf-8 -*-
import sys

def main():
	txt_in = sys.stdin.read()

	enc = {
		  "0": "O"
		, "1": "I"
		, "2": "Z"
		, "3": "E"
		, "4": "A"
		, "5": "S"
		, "6": "G"
		, "7": "T"
		, "8": "B"
		, "9": "P"
	}

	for k in enc.items():
		txt_in = txt_in.replace(*k)
	
	print(txt_in[(txt_in.find("\n") + 1):-1])


if __name__ == '__main__':
	main()