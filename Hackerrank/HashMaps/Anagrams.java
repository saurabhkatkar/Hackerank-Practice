import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Anagrams {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        HashMap<String, Integer> subStrings = new HashMap<>();
        int l = s.length();
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                String temp = s.substring(i, j);
                if (subStrings.get(temp) == null && s.substring(j).contains(temp)) {
                    subStrings.put(s.substring(i, j), value);
                }
            }
        }

    }

    static void checkAnagrams(String s1) {

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            System.out.println(result);

            // bufferedWriter.write(String.valueOf(result));
            // bufferedWriter.newLine();
        }

        // bufferedWriter.close();

        scanner.close();
    }
}
