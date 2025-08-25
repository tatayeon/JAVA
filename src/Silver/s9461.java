package Silver;

import java.util.Scanner;

public class s9461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 개수

        long[] dp = new long[101]; // N은 최대 100까지
        dp[1] = dp[2] = dp[3] = 1;
        dp[4] = dp[5] = 2;

        for (int i = 6; i <= 100; i++) {
            dp[i] = dp[i - 1] + dp[i - 5];
        }

        while (T-- > 0) {
            int N = sc.nextInt();
            System.out.println(dp[N]);
        }
    }
}
