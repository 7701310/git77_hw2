import sys


def calculate_bonus(size, animals, eco):
    # Hint: 順序問題
    return (size // animals) * eco * animals


def main():
    n = int(input())

    for _ in range(n):
        f = int(input())
        total = 0

        for _ in range(f):
            size, animals, eco = map(int, input().split())
            total += calculate_bonus(size, animals, eco)

        print(total)


if __name__ == "__main__":
    main()