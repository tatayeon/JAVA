package Silver;

import java.util.LinkedList;
import java.util.Scanner;

public class s11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 총 인원 수
        int K = sc.nextInt(); // 제거할 간격
        LinkedList<Integer> list = new LinkedList<>();
        int[] result = new int[N];

        for (int i = 1; i <= N; i++) {
            list.add(i); // 1부터 N까지 사람 추가
        }

        int index = 0; // 현재 위치 인덱스
        for (int i = 0; i < N; i++) {
            index = (index + K - 1) % list.size();
            result[i] = list.remove(index);
        }

        System.out.print("<");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) System.out.print(", ");
        }
        System.out.println(">");
    }
}