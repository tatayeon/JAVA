package Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class s17626 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        // 미리 제곱수 리스트
        List<Integer> squares = new ArrayList<>();
        for (int k = 1; k * k <= n; k++) squares.add(k * k);

        for (int i = 1; i <= n; i++) {
            for (int sq : squares) {
                if (sq > i) break;
                if (dp[i - sq] + 1 < dp[i]) dp[i] = dp[i - sq] + 1;
            }
        }
        System.out.println(dp[n]);
    }
}
