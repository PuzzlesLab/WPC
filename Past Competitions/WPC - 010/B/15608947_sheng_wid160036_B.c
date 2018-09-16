import sys

x = sys.stdin.read().strip().split("\n")
x.pop(0)

key = {chr(k + ord('a')):(k % 3) + 1 for k in range(26)}
for i in range(4):
	key[chr(i + ord('p'))] = i + 1
for i in range(3):
	key[chr(i + ord('t'))] = i + 1
for i in range(4):
	key[chr(i + ord('w'))] = i + 1
key[' '] = 1

for i, k in enumerate(x):
	print("Case #{}: {}".format(i + 1, sum([key[c] for c in k])))
