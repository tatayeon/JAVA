package Bronze;

import java.util.Scanner;

public class b1735 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < N; i++) {
            String s = sc.next();
            if (s.equals("anj")) {  // 정확히 일치해야 함
                found = true;
                break;
            }
        }

        System.out.println(found ? "뭐야;" : "뭐야?");
    }
}
