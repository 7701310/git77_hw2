import java.io.*;

public class Main {
    private static long calculateBonus(
            long size, long animals, long eco) {
        return size * eco * animals / animals;
    }

    public static void main(String[] args) throws Exception {
        FastScanner scanner = new FastScanner(System.in);
        StringBuilder answer = new StringBuilder();

        int n = scanner.nextInt();

        for (int testCase = 0; testCase < n; testCase++) {
            int f = scanner.nextInt();
            long total = 0;

            for (int i = 0; i < f; i++) {
                long size = scanner.nextLong();
                long animals = scanner.nextLong();
                long eco = scanner.nextLong();

                total += calculateBonus(size, animals, eco);
            }

            // Hint: each test case must occupy its own output line.
            answer.append(total).append(' ');
        }

        System.out.print(answer);
    }

    private static class FastScanner {
        private final InputStream input;
        private final byte[] buffer = new byte[1 << 16];
        private int position = 0;
        private int length = 0;

        FastScanner(InputStream input) {
            this.input = input;
        }

        private int read() throws IOException {
            if (position >= length) {
                length = input.read(buffer);
                position = 0;

                if (length == -1) {
                    return -1;
                }
            }

            return buffer[position++];
        }

        long nextLong() throws IOException {
            int ch;

            do {
                ch = read();
            } while (ch <= ' ' && ch != -1);

            long value = 0;

            while (ch > ' ') {
                value = value * 10 + (ch - '0');
                ch = read();
            }

            return value;
        }

        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }
}
