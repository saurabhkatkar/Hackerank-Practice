
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

public class FrequencyQuries {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        HashMap<Integer, Integer> data = new HashMap<>();
        List<Integer> result = new ArrayList<Integer>();

        for (List<Integer> query : queries) {
            int temp = query.get(0);
            int val = query.get(1);
            switch (temp) {
                case 1:
                    if (data.get(val) == null) {
                        data.put(val, 1);
                    } else {
                        int count = data.get(val);
                        data.put(val, count + 1);
                    }
                    break;
                case 2:
                    if (data.get(val) != null) {
                        int count = data.get(val);
                        data.put(val, count - 1);
                    }
                    break;
                case 3:
                    Integer[] values = data.values().toArray(new Integer[data.size()]);
                    int flag = 0;
                    for (int i : values) {
                        if (i == val) {
                            flag = 1;
                            break;
                        }
                    }
                    result.add(flag);
                    break;
            }

        }
        return result;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt).collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> ans = freqQuery(queries);
        System.out.println(ans);

        // bufferedWriter.write(ans.stream().map(Object::toString).collect(joining("\n"))
        // + "\n");

        bufferedReader.close();
        // bufferedWriter.close();
    }
}
