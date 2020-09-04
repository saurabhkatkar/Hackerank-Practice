
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Notification {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        float median = 0;
        int notif = 0, l = expenditure.length;
        for (int i = d; i < l; i++) {
            int[] newArr = Arrays.copyOfRange(expenditure, i - d, i);
            Arrays.sort(newArr);
            if (d % 2 == 0) {
                median = (float) (newArr[d / 2] + newArr[(d / 2) - 1]) / 2;
            } else {
                median = newArr[d / 2];
            }
            System.out.println(median);
            if (expenditure[i] >= 2 * median) {
                notif++;
            }
        }

        return notif;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

        System.out.println(result);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
    }
}
