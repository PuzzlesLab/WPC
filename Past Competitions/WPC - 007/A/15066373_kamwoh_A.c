n = 10000
dp = [0 for x in range(n + 1)]
dp[0] = 1
coins = [x**3 for x in range(1, 22)]

for c in coins:
	for i in range(1, n+1):
		if i >= c:
			dp[i] += dp[i - c]

try:
	while True:
		amount = int(input())
		print(dp[amount])
except:
	pass