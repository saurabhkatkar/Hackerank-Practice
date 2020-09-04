
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NewYear {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int l = q.length, flag = 0, cost = 0;
        for (int i = 0; i < l; i++) {
            int temp = q[i] - i - 1;
            if (temp > 2) {
                flag = 1;
                break;
            }
            for (int j = Integer.max(0, q[i] - 2); j < i; j++)
                if (q[j] > q[i])
                    cost++;

        }
        if (flag == 1) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(cost);
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
