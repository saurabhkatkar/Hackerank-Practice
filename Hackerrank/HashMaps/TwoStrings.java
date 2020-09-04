
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        HashMap<Character, Integer> chars = new HashMap<>();
        for (Character c : s1.toCharArray()) {
            if (chars.get(c) == null) {
                chars.put(c, 1);
            }
        }
        for (Character c : s2.toCharArray()) {
            if (chars.get(c) == null) {
                continue;
            } else {
                return "YES";
            }
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            System.out.println(result);

            // bufferedWriter.write(result);
            // bufferedWriter.newLine();
        }

        // bufferedWriter.close();

        scanner.close();
    }
}
