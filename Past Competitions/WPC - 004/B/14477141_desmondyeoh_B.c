n = int(input())

for i in range(n):
	_x = input()
	k = int(input())
	pairs = {}
	for j in range(k):
		person, party = input(), input()
		pairs[person] = party
	inv_pairs = {v: k for (k, v) in pairs.items()}
	pcnt = {k:0 for k in pairs.keys()}
	cnt = {}
	ind = []
	for k,v in pairs.items():
		if v == 'independent':
			cnt[k] = 0
			ind.append(k)
		else:
			cnt[v] = 0

	m = int(input())
	if m == 0:
		print('tie')
		if i > 0:
			print()
		continue
	for n in range(m):
		try:
			pname = input()
			pcnt[pname] += 1
			# if pname in ind:
			# 	cnt[pname] += 1
			# else:
			# 	cnt[pairs[pname]] += 1
		except:
			pass
	# print(cnt)
	if i > 0:
		print()
	# std = sorted(cnt.items(), key=lambda kv: -kv[1])
	pstd = sorted(pcnt.items(), key=lambda kv: -kv[1])
	# if len(std) > 1 and std[0][1] == std[1][1]:
	# 	print('tie')
	if len(pstd) > 1 and pstd[0][1] == pstd[1][1]:
		print('tie')
	else:
		print('independent' if pstd[0][0] in ind else pairs[pstd[0][0]])