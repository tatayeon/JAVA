package Gold;

import java.util.*;

public class g1167_self {

    static boolean[] visited;
    static int[] distance;
    static ArrayList<Edge>[] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        A = new ArrayList[N+1];
        for(int i = 1; i <= N; i++) {
            A[i] = new ArrayList<Edge>();
        }

        for(int i = 0; i < N; i++) {
            int k = sc.nextInt();
            while(true){
                int S = sc.nextInt();
                if(S == -1) break;
                int E = sc.nextInt();
                A[k].add(new Edge(S, E));
            }
        }

        visited = new boolean[N+1];
        distance = new int[N+1];
        BFS(1);
        int Max = 1;
        for(int i = 2; i <= N; i++) {
            if(distance[Max] < distance[i]) {
                Max = i;
            }
        }

        distance  = new int[N+1];
        visited = new boolean[N+1];
        BFS(Max);
        Arrays.sort(distance);
        System.out.println(distance[N]);

    }

    private static void BFS(int i) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(i);
        visited[i] = true;
        while(!q.isEmpty()) {
            int now_node = q.poll();
            for(Edge e : A[now_node]) {
                int k = e.e;
                int j = e.value;
                if(!visited[j]) {
                    visited[k] = true;
                    q.add(k);
                    distance[k] = distance[now_node] + j;
                }
            }
        }
    }

    private static class Edge {
        int e;
        int value;
        public Edge(int e, int value) {
            this.e = e;
            this.value = value;
        }
    }
}
