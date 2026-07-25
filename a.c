#include <stdio.h>

<<<<<<< HEAD
=======
long long calculateBonus(
    long long size,
    long long animals,
    long long eco
) {
    return size * eco * animals / animals;
}

>>>>>>> origin/chang/name
int main(void) {
    int n;

    scanf("%d", &n);

<<<<<<< HEAD
    for (int testCase = 0; testCase < n; testCase++) {
=======
    while (n--) {
>>>>>>> origin/chang/name
        int f;
        long long total = 0;

        scanf("%d", &f);

<<<<<<< HEAD
        for (int i = 0; i < f; i++) {
=======
        while (f--) {
>>>>>>> origin/chang/name
            long long size;
            long long animals;
            long long eco;

<<<<<<< HEAD
            /* Hint: input field widths must agree with storage widths. */
            scanf("%d %d %d", &size, &animals, &eco);

            total += size * eco;
=======
            scanf("%lld %lld %lld", &size, &animals, &eco);

            /* Hint: also test a case containing more than one farm. */
            total = calculateBonus(size, animals, eco);
>>>>>>> origin/chang/name
        }

        printf("%lld\n", total);
    }

    return 0;
}
