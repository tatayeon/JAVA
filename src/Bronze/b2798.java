package Bronze;

import java.util.Scanner;

public class b2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int target = sc.nextInt();

        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }

        int result = 0;

        // 3장의 카드를 선택하는 모든 조합 탐색
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k];

                    // 목표값을 넘지 않으면서 최대 합을 업데이트
                    if (sum <= target && sum > result) {
                        result = sum;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
