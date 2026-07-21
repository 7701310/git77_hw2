#include <stdio.h>

long long calculateBonus(
    long long size,
    long long animals,
    long long eco
) {
    return size * eco * animals / animals;
}

int main(void) {
    int n;

    scanf("%d", &n);

    while (n--) {
        int f;
        long long total = 0;

        scanf("%d", &f);

        while (f--) {
            long long size;
            long long animals;
            long long eco;

            scanf("%lld %lld %lld", &size, &animals, &eco);

            /* Hint: also test a case containing more than one farm. */
            total = calculateBonus(size, animals, eco);
        }

        printf("%lld\n", total);
    }

    return 0;
}
