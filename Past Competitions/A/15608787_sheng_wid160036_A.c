import sys

x = sys.stdin.read().strip().split("\n")
i, j = [int(k) for k in x.pop(0).split()]

singular_plural = {}
for k in range(i):
	a, b = x.pop(0).split()
	singular_plural[a] = b

for k in x:
	if k in singular_plural:
		print(singular_plural[k])
	else:
		if k[-1].lower() == "y" and not k[-2].lower() in ["a", "e", "i", "o", "u"]:
			print(k[:-1] + "ies")
		elif k[-1].lower() in ["o", "s", "x"] or k[-2:].lower() in ["ch", "sh"]:
			print(k + "es")
		else:
			print(k + "s")
