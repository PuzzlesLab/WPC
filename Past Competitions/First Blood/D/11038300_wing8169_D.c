from sys import stdin, stdout
import queue

while True:
    num, limit = stdin.readline().split()
    num = int(num)
    results = []
    limit = int(limit)
    records = [40] * num
    que = queue.Queue()
    for j in range(num):
        que.put(j+1)
    if num == 0 and limit == 0:
        break
    x = 0
    counter = 1
    is_remain = False
    while not que.empty():
        if counter > limit:
            counter = 1
        if records:
            if x >= len(records):
                x = 0
            if is_remain:
                records[x] -= remain
                is_remain = False
                counter -= 1
            else:
                records[x] -= counter
            if records[x] > 0:
                temp = que.get()
                que.put(temp)
            else:
                if records[x] == 0:
                    records.remove(records[x])
                    results.append(que.get())
                    x -= 1
                elif records[x] < 0:
                    remain = -records[x]
                    records.remove(records[x])
                    results.append(que.get())
                    is_remain = True
                    x -= 1
        counter += 1
        x += 1
    if not records:
        for index, result in enumerate(results):
            if index != len(results)-1:
                stdout.write("%3d" % result)
            else:
                stdout.write("%3d\n" % result)