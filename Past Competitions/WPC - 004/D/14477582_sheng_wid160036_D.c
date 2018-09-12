# -*- coding: utf-8 -*-
import sys


def main():

	x = sys.stdin.read().split('\n')[:-1]
	
	n = int(x.pop(0))
	for _ in range(n):
		m = int(x.pop(0))
		trans = {}
		for _ in range(m):
			k, v = x.pop(0).split('->')
			trans[k] = v
		m = int(x.pop(0))
		s = 0
		for _ in range(m):
			init, target, step = x.pop(0).split(' ')
			track = set(list(trans.keys()) + [target])
			counter = {k: init.count(k) for k in track}
			for _ in range(int(step)):
				t = {k: 0 for k in track}
				for c in counter:
					if c in trans:
						for k in counter:
							t[k] += trans[c].count(k) * counter[c]
							if c == k:
								t[k] -= counter[c]
				for k in counter:
					counter[k] += t[k]
			print(counter[target])


if __name__ == '__main__':
	main()