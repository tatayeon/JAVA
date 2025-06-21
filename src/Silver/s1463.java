package Silver;

import java.util.Scanner;
//DP 아래에서부터 올라가면서 최소를 측정하는 방식이다.
// 중요한 것은 숫자를 올려가면서 이 연산을 할 수 있는 경우의 수를 찾는 것
public class s1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[N + 1];

        dp[1] = 0; // 1은 이미 1이므로 연산 횟수 0
        //숫자 i를 만들기 위해 어떤 수에서 연산을 했는지를 반대로 추적합니다.
        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + 1; // 기본: 1을 빼는 경우
            if (i % 2 == 0) {
                //이전 단계로부터 오는 경로 중 더 적은 연산 횟수를 가진 쪽을 선택하는 겁니다.
                // ex) dp[10] = Math.min(4, 3) = 3
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        System.out.println(dp[N]);
    }
}
