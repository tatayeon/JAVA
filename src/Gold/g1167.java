package Gold;

import java.io.IOException;
import java.util.*;

public class g1167 {

    static boolean[] visited;
    static int[] distance;
    static ArrayList<Edge>[] A;


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        A = new ArrayList[N + 1];
        for(int i = 1;i <= N;i++) {
            A[i] = new ArrayList<Edge>();
        }

        for(int i = 0; i < N;i++) {
            int S = sc.nextInt();
            while(true){
                int E = sc.nextInt();
                if(E == -1) break;
                int V = sc.nextInt();
                A[S].add(new Edge(E, V));
            }
        }

        distance = new int[N + 1];
        visited = new boolean[N + 1];
        BFS(1);
        int max = 1;
        for(int i = 2;i <= N;i++) {
            if(distance[max] < distance[i]) {
                max = i;
            }
        }

        distance = new int[N + 1];
        visited = new boolean[N + 1];
        BFS(max);
        Arrays.sort(distance);
        System.out.println(distance[N]);

    }
    private static class Edge {
        int e;
        int value;

        public Edge(int e, int value) {
            this.e = e;
            this.value = value;
        }
    }

    private static void BFS(int i) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(i);
        visited[i] = true;
        while (!q.isEmpty()) {
            int now_node = q.poll();
            for (Edge k : A[now_node]) {
                int e = k.e;
                int v = k.value;
                if(!visited[e]) {
                    visited[e] = true;
                    q.add(e);
                    distance[e] = distance[now_node] + v;
                }
            }
        }
    }


}
