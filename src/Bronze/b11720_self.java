package Bronze;

import java.util.Scanner;

public class b11720_self {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String total = sc.next();
        char[] array = total.toCharArray();

        int result = 0;
        for (int i = 0; i < N; i++) {
            result += array[i] - '0';
        }

        System.out.println(result);
    }

}
