package Silver;

import java.util.Scanner;

public class s2805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 나무의 수
        int M = sc.nextInt(); // 필요한 나무의 길이
        int[] arr = new int[N];
        int max = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]); // 가장 긴 나무 찾기
        }

        int left = 0;       // 최소 높이
        int right = max;    // 최대 높이
        int result = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            long sum = 0;

            for (int h : arr) {
                if (h > mid) {
                    sum += h - mid;
                }
            }

            if (sum >= M) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(result);
    }
}