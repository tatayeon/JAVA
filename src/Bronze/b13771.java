package Bronze;

import java.util.Arrays;
import java.util.Scanner;

public class b13771 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 크기가 N인 배열 선언
        double[] arr = new double[N];

        // 배열에 숫자 입력받기
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextDouble();
        }

        // 배열 정렬
        Arrays.sort(arr);


        System.out.printf(String.valueOf(arr[1]));
    }
}
