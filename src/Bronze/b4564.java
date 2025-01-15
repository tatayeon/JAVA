package Bronze;

import java.util.Scanner;

public class b4564 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int S = sc.nextInt();
            if (S == 0) break;
            System.out.print(S + " ");

            // 한 자리 숫자가 될 때까지 계산
            while (S >= 10) {
                S = multiplyDigits(S);
            }
            System.out.println();
        }
    }

    // 각 자리 숫자를 곱하는 메서드
    private static int multiplyDigits(int number) {
        int result = 1;


        // 각 자리 숫자 곱하기
        while (number > 0) {
            result *= number % 10; // 마지막 자리 숫자를 곱함
            number /= 10;         // 마지막 자리 제거
        }

        System.out.print(result + " "); // 결과 출력c
        return result;
    }
}
