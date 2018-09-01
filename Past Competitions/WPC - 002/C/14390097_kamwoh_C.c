def gcd(x, y):
    while (y):
        x, y = y, x % y

    return x


n = int(input())

for i in range(n):
    a = int(input(), 2)
    b = int(input(), 2)

    if gcd(a, b) != 1:
        print('Pair #%s: All you need is love!' % (i + 1))
    else:
        print('Pair #%s: Love is not all you need!' % (i + 1))
