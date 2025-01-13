package Bronze;

import java.util.Scanner;

public class b1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;

            String numberStr = String.valueOf(N);

            // 문자열 뒤집기
            String reversed = new StringBuilder(numberStr).reverse().toString();

            // 팰린드롬 판별
            if (numberStr.equals(reversed)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
