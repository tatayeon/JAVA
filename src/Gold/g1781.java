package Gold;

import java.util.*;

public class g1781 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<int[]> problems = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int d = sc.nextInt();
            int p = sc.nextInt();
            problems.add(new int[]{d, p});
        }

        problems.sort(Comparator.comparingInt(a -> a[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int[] problem : problems) {
            int deadline = problem[0];
            int ramen = problem[1];

            pq.add(ramen);

            if (pq.size() > deadline) {
                pq.poll(); // 가장 작은 보상 문제 버림
            }
        }

        int result = 0;
        while (!pq.isEmpty()) {
            result += pq.poll();
        }

        System.out.println(result);
    }
}
