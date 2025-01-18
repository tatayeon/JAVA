package Bronze;

import java.util.Scanner;

public class b9325 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스 수 입력
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            // 차량 기본 가격 입력
            int total = sc.nextInt();

            // 옵션 개수 입력
            int N = sc.nextInt();

            // 옵션 가격 계산
            for (int i = 0; i < N; i++) {
                int q = sc.nextInt(); // 옵션 수량
                int p = sc.nextInt(); // 옵션 가격
                total += q * p;
            }

            // 결과 출력
            System.out.println(total);
        }

        sc.close();
    }
}
