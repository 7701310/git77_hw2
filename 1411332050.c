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

            /* Hint: input field widths must agree with storage widths. */
            scanf("%d %d %d", &size, &animals, &eco);

            total += size * eco;
        }

        printf("%lld\n", total);
    }

    return 0;
}
