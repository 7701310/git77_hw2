import java.io.*;
<<<<<<< HEAD
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine().trim());
        StringBuilder answer = new StringBuilder();

        for (int testCase = 0; testCase < n; testCase++) {
            int f = Integer.parseInt(reader.readLine().trim());
            long total = 0;

            // Hint: one iteration should consume exactly one farm record.
            for (int i = 0; i <= f; i++) {
                StringTokenizer tokenizer =
                        new StringTokenizer(reader.readLine());

                long size = Long.parseLong(tokenizer.nextToken());
                long animals = Long.parseLong(tokenizer.nextToken());
                long eco = Long.parseLong(tokenizer.nextToken());

                total += size * eco;
            }

            answer.append(total).append('\n');
=======

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
>>>>>>> origin/chang/name
        }

        System.out.print(answer);
    }
<<<<<<< HEAD
=======

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
>>>>>>> origin/chang/name
}
