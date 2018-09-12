from functools import reduce

cache = {}


def ncr(n, r):
    # if r > n / 2:
    if r == 0 or r == n:
        return 1

    if (n, r) in cache:
        return cache[(n, r)]

    num = 1
    for i in range(n, n - r, -1):
        num *= i

    den = 1
    for i in range(r, 1, -1):
        den *= i

    o = num / den
    cache[(n, r)] = o
    return o


#
# for i in range(4):
#     print ncr(3, i)

n = int(input())

for j in range(n):
    s = input()
    l, r = s.split('+')
    # l = (xxxx
    l = l[1:]
    # r = xxx)^xx
    r, p = r.split('^')
    r = r[:-1]
    p = int(p)

    if p == 1:
        print('Case %s: %s+%s' % (j + 1, l, r))
    else:
        lp = p
        rp = 0
        finaloutput = l + '^%s+' % lp
        lp -= 1
        rp += 1
        for i in range(1, p):
            co = int(ncr(p, i))
            if lp != 1 and rp != 1:
                o = '%s*%s^%s*%s^%s+' % (co, l, lp, r, rp)
            elif lp == 1 and rp != 1:
                o = '%s*%s*%s^%s+' % (co, l, r, rp)
            elif lp != 1:
                o = '%s*%s^%s*%s+' % (co, l, lp, r)
            else:
                o = '%s*%s*%s+' % (co, l, r)
            lp -= 1
            rp += 1
            finaloutput += o
        o = r + '^%s' % rp
        finaloutput += o
        print('Case %s: %s' % (j + 1, finaloutput))
