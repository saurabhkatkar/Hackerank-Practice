
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ValidString {

    // Complete the isValid function below.
    static String isValid(String s) {
        HashMap<Character, Integer> countChars = new HashMap<>();
        HashMap<Integer, Integer> countValues = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (countChars.containsKey(s.charAt(i))) {
                countChars.put(s.charAt(i), countChars.get(s.charAt(i)) + 1);
            } else {
                countChars.put(s.charAt(i), 1);
            }
        }
        int min = 9999;
        for (int val : countChars.values()) {
            if (countValues.containsKey(val)) {
                countValues.put(val, countValues.get(val) + 1);
            } else {
                countValues.put(val, 1);
            }
        }

        for (int val : countValues.values()) {
            if (val < min) {
                min = val;
            }
        }

        if (countValues.size() > 2) {
            return "NO";
        } else if (min > 1) {
            return "NO";
        }
        return "YES";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        System.out.println(result);

        // bufferedWriter.write(result);
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
    }
}
