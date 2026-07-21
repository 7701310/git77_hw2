import java.io.*;
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

            for (int i = 0; i < f; i++) {
                StringTokenizer tokenizer =
                        new StringTokenizer(reader.readLine());

                long size = Long.parseLong(tokenizer.nextToken());
                long animals = Long.parseLong(tokenizer.nextToken());
                long eco = Long.parseLong(tokenizer.nextToken());

                total += size * eco;
            }

            answer.append(total).append('\n');
        }

        System.out.print(answer);
    }
}