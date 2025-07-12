package Silver;

import java.io.IOException;
import java.util.Scanner;

public class s2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 계단 수
        int[] stair = new int[n + 1]; // 계단 점수 (1-based)
        int[] dp = new int[n + 1]; // dp[i]: i번째 계단까지 얻을 수 있는 최대 점수

        for (int i = 1; i <= n; i++) {
            stair[i] = sc.nextInt();
        }

        if (n == 1) {
            System.out.println(stair[1]);
            return;
        }

        // 초기값 설정
        dp[1] = stair[1];
        dp[2] = stair[1] + stair[2];

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + stair[i - 1]) + stair[i];
        }

        System.out.println(dp[n]);
    }
}
