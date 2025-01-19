package Bronze;

import java.util.Scanner;

public class b2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[8];  // 8개의 숫자를 받으므로 배열 크기를 8로 설정
        boolean ascending = true;
        boolean descending = true;

        // 8개의 숫자 입력 받기
        for(int i = 0; i < 8; i++) {
            A[i] = sc.nextInt();
        }

        // ascending, descending 여부 판단
        for(int i = 0; i < 7; i++) {
            if (A[i] < A[i + 1]) {
                descending = false;
            } else if (A[i] > A[i + 1]) {
                ascending = false;
            }
        }

        // 결과 출력
        if (ascending) {
            System.out.println("ascending");
        } else if (descending) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
