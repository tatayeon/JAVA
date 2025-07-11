package Silver;

import java.util.*;

public class s9375 {
    static class Node{
        String name;
        String kind;

        public Node(String name, String kind) {
            this.name = name;
            this.kind = kind;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수
        for (int t = 0; t < T; t++) {
            int M = sc.nextInt();
            HashMap<String, Integer> map = new HashMap<>();

            for (int i = 0; i < M; i++) {
                String name = sc.next();
                String kind = sc.next();
                map.put(kind, map.getOrDefault(kind, 0) + 1);
            }

            int result = 1;
            for (int count : map.values()) {
                result *= (count + 1); // 착용 X 포함
            }

            System.out.println(result - 1); // 아무것도 안 입는 경우 제거
        }
    }
}
