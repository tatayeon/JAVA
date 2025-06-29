package Bronze;

import java.util.Scanner;

public class b13136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();
        int N = sc.nextInt();

        int row = (int)Math.ceil(R / (double)N);
        int col = (int)Math.ceil(C / (double)N);

        System.out.println(row * col);
    }
}
