package Silver;

import java.util.Scanner;

public class s1629 {
    //logN안에 들아와야한다.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        System.out.println(modPow(A, B, C));
    }

    // 빠른 거듭제곱 (재귀)
    public static long modPow(long a, long b, long c) {
        if (b == 0) return 1;
        long half = modPow(a, b / 2, c);
        long result = (half * half) % c;
        if (b % 2 == 1) {
            result = (result * a) % c;
        }
        return result;
    }
}
//
//public static void main(String[] args){
//    Scanner sc = new Scanner(System.in);
//    long A = sc.nextLong();
//    long B = sc.nextLong();
//    long C = sc.nextLong();
//
//    long result = 1;
//    A = A % C;
//
//    while(B > 0){
//        if(B % 2 == 1){
//            result = (result * A) % C;
//        }
//        A = (A * A) % C;
//        B /= 2;
//    }
//
//    System.out.println(result);
//}