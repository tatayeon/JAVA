package Silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class s2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        while (q.size() > 1) {
            q.poll();
            int temp = q.poll();
            q.add(temp);
        }

        System.out.println(q.poll());

    }
}
