package Bronze;

import java.util.Scanner;

public class b5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // 종료 조건
            if (a == 0 && b == 0) {
                break;
            }

            // 배수와 약수 판별
            if (b % a == 0) { // b가 a의 배수
                System.out.println("factor");
            } else if (a % b == 0) { // a가 b의 배수 (즉 b가 a의 약수)
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
        sc.close();
    }
}
