package Bronze;

import java.util.Scanner;

public class b31403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // 첫 번째 계산: A + B - C 출력
        System.out.println(A + B - C);

        // 두 번째 계산: A와 B를 문자열로 결합하여 34로 출력
        String a_B = Integer.toString(A) + Integer.toString(B);  // A와 B를 문자열로 결합
        int a_b = Integer.valueOf(a_B);
        System.out.println(a_b - C);  // 결합된 문자열 출력
    }
}
