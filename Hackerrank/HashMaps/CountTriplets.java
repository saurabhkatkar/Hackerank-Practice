
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CountTriplets {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
        HashMap<Long, Long> powers = new HashMap<>();
        int i, l = arr.size();
        for (i = 0; i < l; i++) {
            long temp = arr.get(i);
            long power = (long) (Math.log(temp) / Math.log(r));
            long count = 1;
            if (powers.get(power) == null) {
                count = 1;
            } else {
                count = powers.get(power) + 1;
            }
            powers.put(power, count);
        }

        Long[] keys = powers.keySet().toArray(new Long[0]);
        long res = 0;
        for (i = 0; i < keys.length - 2; i++) {
            res += powers.get(keys[i]) * powers.get(keys[i + 1]) * powers.get(keys[i + 2]);
        }
        System.out.println(powers);
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Long::parseLong)
                .collect(toList());

        long ans = countTriplets(arr, r);
        System.out.println(ans);

        // bufferedWriter.write(String.valueOf(ans));
        // bufferedWriter.newLine();

        bufferedReader.close();
        // bufferedWriter.close();
    }
}
