import math

for i in range(int(input())):
    t, r, c = input().split()
    r, c = int(r), int(c)
    if t == 'r':
        print(min(r, c))
    elif t == 'K':
        print(math.ceil(r/2.0) * math.ceil(c/2.0))
    elif t == 'Q':
        if r == c == 4:
            print(3)
        else:
            print(min(r, c))
    else: # k
        print(math.ceil(r*c/2.0))
