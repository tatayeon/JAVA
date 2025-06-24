package Bronze;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codingTest_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[8];
        for (int i = 0; i < 8; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(solution(numbers));
    }
    private static int solution(int[] numbers) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int majority = numbers.length / 2;
        for (int num : numbers) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > majority) {
                return num;  // 과반수 넘는 값 발견 시 바로 반환
            }
        }
        return -1; // 과반수 넘는 값이 없을 경우
    }
}
