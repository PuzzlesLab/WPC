code = {
    '0': 'O',
    '1': 'I',
    '2': 'Z',
    '3': 'E',
    '4': 'A',
    '5': 'S',
    '6': 'G',
    '7': 'T',
    '8': 'B',
    '9': 'P'
}

i = 0
n = int(input())

try:
    while i != n:
        while True:
            s = input() # it will break when EOF
            if len(s) == 0: # or blank line
                break
            for c in s:
                if c in code:
                    print(code[c], end='')
                else:
                    print(c, end='')
            print()
        print()
        i += 1
except:
    pass