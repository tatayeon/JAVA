package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class b10798 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        char[][] A = new char[5][15]; // 최대 15글자 가능하도록 설정

        // 배열 초기화 이 과정을 빠뜨리기가 쉽다 주위!
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                A[i][j] = ' '; // 기본값 공백
            }
        }

        // 입력받아 배열에 저장
        for (int i = 0; i < 5; i++) {
            String line = sc.nextLine(); // 한 줄 입력받기
            for (int j = 0; j < line.length(); j++) {
                A[i][j] = line.charAt(j); // 입력 문자를 배열에 저장
            }
        }

        // 세로로 읽어 출력
        for (int j = 0; j < 15; j++) { // 열 우선 탐색
            for (int i = 0; i < 5; i++) { // 각 행 탐색
                if (A[i][j] != ' ') { // 공백은 출력하지 않음
                    System.out.print(A[i][j]);
                }
            }
        }
    }
}
