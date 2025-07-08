package Bronze;

import java.util.Scanner;

public class b1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] S = new int[26];
        String[] arr = new String[N];
        boolean result = false;
        for (int i = 0; i < N; i++) {
            char temp = sc.next().charAt(0);
            S[temp - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (S[i] >= 5) {
                result = true;
                char alphabet = (char) ('a' + i); // 아스키 코드로 변환
                System.out.print(alphabet);
            }
        }
        if(!result){
            System.out.println("PREDAJA");
        }
    }
}
