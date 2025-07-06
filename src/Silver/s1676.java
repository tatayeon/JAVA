package Silver;

import java.util.Scanner;

public class s1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact =1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        String str = String.valueOf(fact);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';  // 문자 → 숫자 변환
        }
        for (int d : digits) {
            System.out.print(d + " ");  // 결과: 6 6 6 6 6
        }
    }
}
