# -*- coding: utf-8 -*-
import sys

def main():
	txt_in = sys.stdin.read().split("\n\n")[1:]
	
	for i, k in enumerate(txt_in):
		
		if i != 0:
			print()

		if k[-1] == '\n':
			k = k[:-1]

		t = k.split("\n")
		n = int(t.pop(0))
		ppl_party = {}
		for _ in range(n):
			k, v = t.pop(0), t.pop(0)
			ppl_party[k] = v
		t.pop(0)
		ppl_cnt = {k: 0 for k in ppl_party}
		for ppl in t:
			try:
				ppl_cnt[ppl] += 1
			except:
				pass

		result = sorted(ppl_cnt.items(), key=lambda k: k[1])
		if result[-2][1] == result[-1][1] and len(result) > 1:
			print("tie")
		else:
			print(ppl_party[result[-1][0]])


if __name__ == '__main__':
	main()