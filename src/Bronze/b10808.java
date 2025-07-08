package Bronze;

import java.util.Scanner;

public class b10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int[] S = new int[26];
        for(int i = 0; i < 26; i++){
            S[i] = 0;
        }

        for(int i = 0; i < N.length(); i++){
            int temp = S[N.charAt(i) - 'a'];
            S[N.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            System.out.print(S[i] + " ");
        }
    }
}
