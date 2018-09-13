def computeGCD(x, y):
    while (y):
        x, y = y, x % y

    return x

n = int(input())
for _ in range(n):
    a, b = [int(s.strip()) for s in input().split('/')]
    gcd = computeGCD(a, b)
    print(str(int(a // gcd)) + ' / ' + str(int(b // gcd)))
