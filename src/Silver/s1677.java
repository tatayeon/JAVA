package Silver;

import java.util.Scanner;

public class s1677 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;
        int factor = 5;

        while (factor <= N) {
            count += N / factor;
            factor *= 5;
        }

        System.out.println(count);
    }
}
