package Bronze;

import java.util.Scanner;

public class b4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextInt();
            long b = sc.nextInt();
            long c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0) break;

            if(c*c == a*a + b*b){
                System.out.println("right");
            }else if(c*c + a*a == b*b){
                System.out.println("right");
            }else if(c*c + b*b == a*a){
                System.out.println("right");
            }
            else System.out.println("wrong");

        }
    }
}
