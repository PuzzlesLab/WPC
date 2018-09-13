import math;

case = int(input())
for _ in range(case):
    p,q = str(input()).split('/')
    p = int(p)
    q = int(q)
    abc = math.gcd(p,q);
    print(int(p//abc),'/',int(q//abc))
