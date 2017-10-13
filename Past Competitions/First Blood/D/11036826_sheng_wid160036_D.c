def main():
	while True:
		[N, k] = [int(k) for k in input().split(' ')]
		if not N and not k:
			break
		queue = [[a, b] for a, b in zip(range(1, N + 1), [0] * N)]
		token = 1
		store = 1
		res = []
		while len(queue) != 0:
			[idx, val] = queue[0]
			queue.remove(queue[0])
			if val + store <= 40:
				val = val + store
				store = 0
			else:
				store = store + val - 40
				val = 40
			
			if store == 0:
				token = token + 1
				if token > k:
					token = 1
				store = token
			
			if val == 40:
				res.append(idx)
			else:
				queue.append([idx, val])

		print(''.join(['%3d' % k for k in res]))

if __name__ == '__main__':
	main()