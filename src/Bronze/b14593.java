package Bronze;

import java.util.Scanner;

public class b14593 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N+1][3];
        int maxIndex = 1;

        // 데이터 입력
        for (int i = 1; i <= N; i++) {
            arr[i][0] = sc.nextInt(); // 점수
            arr[i][1] = sc.nextInt(); // 제출 횟수
            arr[i][2] = sc.nextInt(); // 마지막 제출 시간
        }

        // 순위 계산
        for (int i = 1; i <= N; i++) {
            if (arr[i][0] > arr[maxIndex][0] ||
                    (arr[i][0] == arr[maxIndex][0] && arr[i][1] < arr[maxIndex][1]) ||
                    (arr[i][0] == arr[maxIndex][0] && arr[i][1] == arr[maxIndex][1] && arr[i][2] < arr[maxIndex][2])) {
                maxIndex = i;
            }
        }

        // 결과 출력
        System.out.println(maxIndex);
    }
}
