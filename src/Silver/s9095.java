package Silver;

import java.util.Scanner;

public class s9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] dp = new int[11]; //초기 세팅값 인덱스별 경우의 수를 미리 초반에는 설정을 한다.
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i = 4; i <= 10; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3]; //점화식으로 나머지의 값들을 구해 놓는다.
        }

        while(T-->0){
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }

    }
}
