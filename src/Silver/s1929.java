package Silver;

// 소수 구하기 문제

import java.util.Scanner;

public class s1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[N+1];

        // 배열 초기화: 0과 1은 소수가 아니므로 0으로 설정
        for (int i = 2; i <= N; i++) {
            A[i] = 1; // 1로 설정: 2 이상은 소수일 가능성 있음
        }

        // 에라토스테네스의 체 알고리즘
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (A[i] == 1) { // i가 소수일 경우
                for (int j = i * i; j <= N; j += i) {
                    A[j] = 0; // i의 배수는 소수가 아님
                }
            }
        }

        // M부터 N까지의 소수를 출력
        for (int i = M; i <= N; i++) {
            if (A[i] == 1) {
                System.out.println(i);
            }
        }
    }
}
