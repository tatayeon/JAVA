package Silver;

import java.util.Scanner;

public class s4375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();

            int length = 1;
            int mod = 1 % n;     // “111…1”을 n으로 나눈 나머지

            // 나머지가 0이 될 때까지
            while (mod != 0) {
                // 다음 자리 1 추가: 기존 *10 + 1, 그리고 다시 n으로 나눈 나머지
                mod = (mod * 10 + 1) % n;
                length++;
            }

            System.out.println(length);
        }

        sc.close();
    }
}
