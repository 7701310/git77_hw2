import sys


def main():
    input = sys.stdin.readline

    n = int(input())

    for _ in range(n):
        f = int(input())
        total = 0

        for _ in range(f):
            size, animals, eco = map(int, input().split())
            # Hint: not every value in an input record changes the premium.
            total += size * eco

        print(total)


if __name__ == "__main__":
    main()
