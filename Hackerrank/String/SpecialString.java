
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SpecialString {

    static Boolean isSpecial(String sub) {
        for (int i = 0; i < (sub.length() / 2); i++) {
            if (sub.charAt(i) != sub.charAt(sub.length() - 1 - i)) {
                return false;
            }
            if (sub.charAt(i) != sub.charAt(sub.length() / 2 - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        int count = 0;
        for (int i = 0; i <= n - 2; i++) {
            for (int j = i + 2; j <= n; j++) {
                if (isSpecial(s.substring(i, j))) {
                    count++;
                }
            }
        }

        return n + count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);

        System.out.println(result);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
    }
}
