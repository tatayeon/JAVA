package Bronze;

import java.util.Scanner;

public class b9046 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 테스트 케이스 개수 입력
        sc.nextLine(); // 버퍼 비우기

        for (int i = 0; i < N; i++) {
            String s = sc.nextLine().toLowerCase(); // 입력 문자열 (소문자로 변환)
            int[] arr = new int[26]; // 알파벳 빈도 배열

            // 알파벳 빈도 계산
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c >= 'a' && c <= 'z') {
                    arr[c - 'a']++;
                }
            }

            // 최대 빈도와 그 알파벳 찾기
            int max = 0;
            int maxIndex = -1;
            boolean isDuplicate = false;

            for (int k = 0; k < 26; k++) {
                if (arr[k] > max) {
                    max = arr[k];
                    maxIndex = k;
                    isDuplicate = false;
                } else if (arr[k] == max) {
                    isDuplicate = true;
                }
            }

            // 결과 출력
            if (isDuplicate) {
                System.out.println("?");
            } else {
                System.out.println((char) (maxIndex + 'a'));
            }
        }

        sc.close();
    }
}
