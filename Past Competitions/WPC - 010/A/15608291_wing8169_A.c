from sys import stdin, stdout

x, y = stdin.readline().strip().split()
ls = dict()
vowels = ("a", "e", "i", "o", "u")
ls2 = ["o", "s", "x", "ch", "sh"]
for i in range(int(x)):
    texts = stdin.readline().strip().split()
    ls[texts[0]] = texts[1]
for j in range(int(y)):
    item = stdin.readline().strip()
    if item in ls.keys():
        stdout.write("%s\n" % ls[item])
    elif item[-1] == 'y' and item[-2] not in vowels:
        stdout.write("%s\n" % (item[:-1] + 'ies'))
    elif item[-1] in ls2:
        stdout.write("%s\n" % (item + 'es'))
    elif item[-2:] in ls2:
        stdout.write("%s\n" % (item + 'es'))
    else:
        stdout.write("%s\n" % (item + 's'))
