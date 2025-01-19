package Silver;

import java.util.Scanner;

public class s5347 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            System.out.println(lcm(a, b));
        }
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static long lcm(long a, long b) {
        return a / gcd(a, b) * b; // 오버플로 방지를 위해 나눗셈 먼저
    }
}
