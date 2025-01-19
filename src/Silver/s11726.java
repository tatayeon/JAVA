package Silver;

import java.util.Scanner;

public class s11726 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long D[] = new long[1001]; //문제에서 1000까지

        D[1] = 1; //길이가  N = 1일때
        D[2] = 2;

        for(int i = 3;  i<= N; i++){
            D[i] = (D[i-1] + D[i-2]) % 10007;
        }
        System.out.println(D[N]);

    }
}
