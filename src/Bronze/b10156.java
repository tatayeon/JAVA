package Bronze;

import java.util.Scanner;

public class b10156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(); // 과자 한개의 가격
        int N = sc.nextInt(); // 사려고하는 과자의 수
        int M = sc.nextInt(); // 현재 동수가 가진 돈

        if(M > (K * N)){
            System.out.println("0");
        }else {
            int result = (K*N) - M;
            System.out.println(result);
        }

    }
}
