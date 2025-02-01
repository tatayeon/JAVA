package Silver;

import java.util.Scanner;

public class s2003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int start_index = 0, end_index = 0, count = 0, sum = 0;

        while (end_index < N) {
            if (sum < M) {
                sum += arr[end_index++];
            } else {
                if (sum == M) count++;
                sum -= arr[start_index++];
            }
        }

        while (start_index < N) {
            if (sum == M) count++;
            sum -= arr[start_index++];
        }

        System.out.println(count);
    }
}
