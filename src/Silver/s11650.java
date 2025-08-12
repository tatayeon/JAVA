package Silver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<int[]> points = new ArrayList<>();

        // N개의 좌표 입력받기
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points.add(new int[]{x, y});
        }

        // 정렬: x 기준 오름차순, x 같으면 y 기준 오름차순
        points.sort((p1, p2) -> {
            if (p1[0] == p2[0]) {
                return Integer.compare(p1[1], p2[1]);
            }
            return Integer.compare(p1[0], p2[0]);
        });

        // 출력
        for (int[] p : points) {
            System.out.println(p[0] + " " + p[1]);
        }

    }
}
