def gcd(a,b):
    while (b):
        a, b = b, a % b
    return a

case = int(input())
for _ in range(case):
    p, q = [int(s.strip()) for s in input().split('/')]
    abc = gcd(p,q);
    print(str(int(p//abc))+' / '+str(int(q//abc)))
