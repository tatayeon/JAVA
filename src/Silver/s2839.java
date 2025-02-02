package Silver;

import java.util.Scanner;

// 설탕 배달
public class s2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 설탕은 3키로 or 5키로
        // 경우의 수 3으로 모두 나눠지는 경우

        int count = 0;

        while (N >= 0) {
            if (N % 5 == 0) {  // 5kg 봉지로 나누어떨어지는 경우
                count += N / 5;
                System.out.println(count);
                return;
            }
            N -= 3;  // 5kg로 나누어떨어지지 않으면 3kg 봉지 하나 사용
            count++;
        }

        System.out.println(-1);  // 정확히 Nkg을 만들 수 없는 경우




    }
}
