package Bronze;

import java.util.Scanner;
//숫자의 합구하기
// 형 변환 String -> char[] 형태 아스키코드
public class b11720 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String snum = sc.next();
        char[] cnum = snum.toCharArray(); // snum을 char[]형태로 변환시키는 부분

        int sum = 0;
        for(int i = 0; i < cnum.length; i++){
            sum += cnum[i] - '0'; // 여기서는 아스키코드의 값을 빼줘야 한다.
        }

        System.out.println(sum);

    }
}
