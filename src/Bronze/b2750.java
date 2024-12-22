package Bronze;

import java.util.Scanner;

public class b2750 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 버블 정렬 알고리즘
        for (int i = 0; i < N - 1; i++) { // N-1번 반복
            for (int j = 0; j < N - i - 1; j++) { // 인접한 두 수 비교
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
