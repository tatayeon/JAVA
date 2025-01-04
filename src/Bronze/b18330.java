package Bronze;

import java.util.Scanner;

public class b18330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 다음 달 예상 사용량
        int K = sc.nextInt(); // 이번 달이 끝난 후 남는 할당량
        int totalQuota = K + 60; // 총 할당량 (이월된 할당량 + 다음 달 기본 60리터)
        int price = 0; // 최종 비용

        // 할당량 내에서 사용하는 경우
        if (N <= totalQuota) {
            price = N * 1500; // 전부 할당량 내에서 사용
        } else {
            // 할당량 내 사용
            price = totalQuota * 1500;
            // 초과량 사용
            price += (N - totalQuota) * 3000;
        }

        System.out.println(price);
    }
}
