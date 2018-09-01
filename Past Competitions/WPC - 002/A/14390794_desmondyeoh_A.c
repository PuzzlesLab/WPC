
import math

try:
    while True:

        step, mod = [int(x) for x in input().split()]

        b = 'Good Choice' if math.gcd(step, mod) == 1 else 'Bad Choice'
        print("{:>10}{:>10}    {}".format(step, mod, b), end='\n\n')

except:
    pass