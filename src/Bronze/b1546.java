package Bronze;

import java.util.Scanner;
// 평균 구하기

public class b1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        long Max = 0;
        long sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if(arr[i] > Max){
                Max = arr[i];
            }
            sum += arr[i];
        }

        System.out.println(sum * 100.0 / Max / N);

    }
}
