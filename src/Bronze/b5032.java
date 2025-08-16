package Bronze;

import java.util.Scanner;

public class b5032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 현재 가진 빈 병 수
        int a = sc.nextInt();
        // 길에서 발견한 빈 병 수
        int b = sc.nextInt();
        // 새 병으로 교환하는 데 필요한 빈 병 수
        int c = sc.nextInt();

        // 현재 가지고 있는 총 빈 병 수
        int bottles = a + b;
        int result = 0;

        // 교환할 수 있는 동안 반복
        while (bottles >= c) {
            int newDrinks = bottles / c;   // 새로 얻는 음료 수
            result += newDrinks;           // 마신 음료 수 누적
            bottles = bottles % c + newDrinks; // 남은 빈 병 + 새로 생긴 빈 병
        }

        System.out.println(result);
    }
}
