package Bronze;

import java.util.Scanner;

public class b10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.indexOf('a' + i); //indexof = 찾을 문자, 시작할 위치를 파라미터로 주면 해당하는 인덱스 위치 반환한다.
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }


    }
}
