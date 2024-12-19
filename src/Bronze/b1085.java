package Bronze;
//직사각형에서 탈출
import java.util.Scanner;

public class b1085 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int closex = Math.min(x, w-x);
        int closey = Math.min(y, h-y);

        System.out.println(Math.min(closex, closey));

    }

}
