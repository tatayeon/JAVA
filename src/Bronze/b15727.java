package Bronze;

import java.util.Scanner;

public class b15727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int t = N/5;
        if(N%5 != 0){
            t++;
        }
        System.out.println(t);

    }
}
