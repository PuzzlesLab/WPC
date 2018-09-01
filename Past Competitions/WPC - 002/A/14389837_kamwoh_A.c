def gcd(x, y):
    while (y):
        x, y = y, x % y

    return x


try:
    # print gcd(99999, 63923)
    while True:
        s, m = [int(x) for x in input().split()]
        if gcd(s, m) == 1:
            ans = 'Good Choice'
        else:
            ans = 'Bad Choice'
        print('%10s%10s    %s\n' % (s, m, ans))
except:
    pass
