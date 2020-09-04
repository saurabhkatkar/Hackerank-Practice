
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Anagrams {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        HashMap<Character, Integer> countAnagrams1 = new HashMap<>();
        HashMap<Character, Integer> countAnagrams2 = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            if (countAnagrams1.containsKey(a.charAt(i))) {
                countAnagrams1.put(a.charAt(i), countAnagrams1.get(a.charAt(i)) + 1);
            } else {
                countAnagrams1.put(a.charAt(i), 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (countAnagrams2.containsKey(b.charAt(i))) {
                countAnagrams2.put(b.charAt(i), countAnagrams2.get(b.charAt(i)) + 1);
            } else {
                countAnagrams2.put(b.charAt(i), 1);
            }
        }
        int common = 0;
        for (Character k : countAnagrams1.keySet()) {
            if (countAnagrams2.containsKey(k)) {

                common += countAnagrams2.get(k) >= countAnagrams1.get(k) ? countAnagrams1.get(k)
                        : countAnagrams2.get(k);
            }
        }
        return a.length() + b.length() - 2 * common;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        System.out.println(res);

        // bufferedWriter.write(String.valueOf(res));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
    }
}
