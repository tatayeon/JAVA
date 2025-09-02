package Silver;

import java.util.Scanner;

public class s2805_R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        int max = 0;
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }

        int left = 0;
        int right = max;
        int result = 0;

        for(int i = 0; i < M; i++){
            long sum = 0;
            int mid = (left + right) / 2;

            for(int h : arr){
                if(h > max){
                    sum += h - mid;
                }

                if (sum >= M) {
                    result = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        System.out.println(result);
    }
}
