package Bronze;

import java.time.temporal.ValueRange;
import java.util.Scanner;

public class b11655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.nextLine().toCharArray();

        for(int i = 0; i < S.length; i++){
            if(S[i] == 32){
                System.out.print(" ");
            } else if (S[i] >= 65 && S[i] <= 90) {
                char lage = (char) (13 + S[i]);
                if(lage > 90){
                    int b = (char) 64 + (lage - 90);
                    lage = (char) b;
                }
                System.out.print(lage);
            } else if (S[i] >= 97 && S[i] <= 122) {
                char small = (char) (13 + S[i]);
                if(small > 122){
                    int a = (char) 96 + (small - 122);
                    small = (char) a;
                }
                System.out.print(small);
            }else{
                System.out.print(S[i]);
            }
        }

    }
}
