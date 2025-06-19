package Bronze;

import java.util.Arrays;
import java.util.Scanner;

public class b1546_self {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int M = arr[N-1];
        long sum = 0;

        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        System.out.println(sum*100.0 / N / M);
    }

}
