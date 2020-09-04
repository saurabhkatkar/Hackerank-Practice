import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMax {

    // Complete the luckBalance function below.
    static int calculate(int k, int[] contests) {
        int min = Integer.MAX_VALUE, max = 0;

        for (int i = 0; i < contests.length; i++) {
            if (contests[i] > max) {
                max = contests[i];
            }
            if (contests[i] < min) {
                min = contests[i];
            }

        }

        return max - min;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scanner.nextLine());

        int k = Integer.parseInt(scanner.nextLine());

        int[] contests = new int[n];

        for (int i = 0; i < n; i++) {
            contests[i] = Integer.parseInt(scanner.nextLine());
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        }

        int result = calculate(k, contests);

        System.out.println(result);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
    }
}
