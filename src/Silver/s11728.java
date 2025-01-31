package Silver;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class s11728 {

    static int N;
    static int M;
    static int pointer_A = 0;
    static int pointer_B = 0;
    static int[] arrA;
    static int[] arrB;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arrA = new int[N];
        arrB = new int[M];
        int[] answer = new int[N + M];

        for (int i = 0; i < N; i++) {
            arrA[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            arrB[i] = sc.nextInt();
        }

        sort(arrA);
        sort(arrB);

        for (int i = 0; i < N + M; i++) {
            if (pointer_A == N) {
                answer[i] = arrB[pointer_B++];
            } else if (pointer_B == M) {
                answer[i] = arrA[pointer_A++];
            } else {
                answer[i] = Check();
            }
        }

        for (int num : answer) {
            System.out.print(num + " ");
        }
    }

    private static int Check() {
        if (arrA[pointer_A] < arrB[pointer_B]) {
            return arrA[pointer_A++];
        } else {
            return arrB[pointer_B++];
        }
    }
}
