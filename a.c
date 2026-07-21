#include <stdio.h>

int main(void) {
    int n;

    scanf("%d", &n);

    for (int testCase = 0; testCase < n; testCase++) {
        int f;
        long long total = 0;

        scanf("%d", &f);

        for (int i = 0; i < f; i++) {
            long long size;
            long long animals;
            long long eco;

            scanf("%lld %lld %lld", &size, &animals, &eco);

            total += size * eco;
        }

        printf("%lld\n", total);
    }

    return 0;
}