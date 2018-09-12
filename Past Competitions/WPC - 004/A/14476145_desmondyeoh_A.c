import sys

# a = "H3LL0 MY L0V3, 1 M H499Y 83C4U53 500N 1 W1LL 83 70 Y0UR 51D3. 7H15 71M3 W17H0U7 Y0U H45 833N 373RN4L. 1 1NV173 Y0U 70 7H3 200 0N3 70 533 7H3 238R42 4ND 60R1L42."
# b = "HELLO MY LOVE, I M HAPPY BECAUSE SOON I WILL BE TO YOUR SIDE. THIS TIME WITHOUT YOU HAS BEEN ETERNAL. I INVITE YOU TO THE ZOO ONE TO SEE THE ZEBRAS AND GORILAS."

# c = list(zip(a, b))

# d = set(c)
# e = [x for x in d if x[0] != x[1]]
# f = dict(e)
f = {
	'7': 'T', 
	'5': 'S', 
	'3': 'E', 
	'8': 'B', 
	'0': 'O', 
	'1': 'I', 
	'4': 'A', 
	'9': 'P', 
	'2': 'Z', 
	'6': 'G'
}




n = sys.stdin.readline()
s = '-1'
i = 0

X = sys.stdin.read()
for k, v in f.items():
	X = X.replace(k, v)
print(X[:-1])