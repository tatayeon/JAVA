package Bronze;

import java.util.Scanner;

public class b27512 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        if(N % 2 == 1 && M % 2 == 1){
            int result = (N * M) -1;
            System.out.println(result);
        }else{
            int result = (N * M);
            System.out.println(result);
        }
    }
}
