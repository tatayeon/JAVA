package Siver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.PriorityQueue;

public class s1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 중복 제거를 위해 HashSet 사용
        HashSet<String> wordSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            wordSet.add(br.readLine());
        }

        // 우선순위 큐 선언
        PriorityQueue<String> myQueue = new PriorityQueue<>((o1, o2) -> {
            if (o1.length() > o2.length()) return 1;
            else if (o1.length() < o2.length()) return -1;
            return o1.compareTo(o2);
        });

        // HashSet의 요소를 우선순위 큐에 추가
        myQueue.addAll(wordSet);

        // 큐가 빌 때까지 출력
        while (!myQueue.isEmpty()) {
            System.out.println(myQueue.poll());
        }
    }
}
