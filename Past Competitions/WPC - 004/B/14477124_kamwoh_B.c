t = int(input())

for ti in range(t):
    input()
    n = int(input())

    cands = {}
    counts = {}

    for ni in range(n):
        name_cand = input()
        name_party = input()
        cands[name_cand] = name_party
        counts[name_cand] = 0

    m = int(input())
    for mi in range(m):
        name = input()
        if name in counts:
            counts[name] += 1

    maxname = ''
    maxcount = 0

    tiename = ''
    tiecount = 0

    for name in counts:
        if counts[name] >= maxcount:
            if counts[name] == maxcount:  # prev max count
                tiecount = counts[name]
                tiename = name

            maxcount = counts[name]
            maxname = name

    if tiecount == maxcount:
        print('tie')
    else:
        print(cands[maxname])

    if ti != t - 1:
        print()
