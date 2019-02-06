package hackerrank.task1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        HashMap hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (hashMap.get(ar[i]) == null) {
                hashMap.put(ar[i], 1);
            } else {
                Integer num = (Integer) hashMap.get(ar[i]);
                num++;
                hashMap.remove(ar[i]);
                hashMap.put(ar[i], num);
            }
        }
        Integer sum = 0;

        for (Object i: hashMap.values()) {
            sum += (Integer) i/2;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {

        System.out.println("Set array size and values ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        sockMerchant(n, ar);

        scanner.close();
    }
}
