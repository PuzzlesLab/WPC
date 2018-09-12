import sys

def generate(ways):
    ways[0] = 1
    coins = [1,5,10,25,50]
    for coin in coins:
        for index in range(coin,len(ways)):
            ways[index] += ways[index-coin]
    return ways

def main():
    ways = [0] *(30001)
    generate(ways)
    for line in sys.stdin:
        input = int(line)
        if ways[input]==1:
            print("There is only",ways[input],"way to produce",input,"cents change.")
        else:
            print("There are",ways[input],"ways to produce",input,"cents change.")

if __name__=="__main__":
    main()