def subarraysum(arr):
	total = max(arr[0], 0)
	global_max = arr[0]
	current_max = arr[0]
	minelement = arr[0]

	for i in range(1, len(arr)):
		current_max = max(arr[i], current_max + arr[i])
		global_max = max(current_max, global_max)
		total += max(arr[i], 0)
		minelement = max(arr[i], minelement)

	if total == 0:
		total = minelement

	return global_max, total

# print(subarraysum([-1,4,2,-1]))

t = int(input())
for _ in range(t):
	n = int(input())
	arr = [int(x) for x in input().split(' ')]
	subarr, subseq = subarraysum(arr)
	# if subarr <= 0:
	# 	s = '-1'
	# else:
	s = str(subarr)
	s += ' '
	# if subseq <= 0:
	# 	s += '-1'
	# else:
	s += str(subseq)
	print(s)