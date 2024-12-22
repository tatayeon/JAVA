package Bronze;

import java.util.Scanner;

public class b2869 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        //그럼 결론적으로 하루에 올라 갈 수 있는 양은 A -B이다. 따라서

        int day = (V - B) / (A - B);

        // 나머지가 있을 경우 (잔여 블럭이 있을 경우)
        if ((V - B) % (A - B) != 0) {
            day++;
        }
        System.out.println(day);

    }
}
