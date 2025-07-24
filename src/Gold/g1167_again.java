package Gold;

import java.util.*;

public class g1167_again {

    static int[] distance;
    static boolean[] visited;
    static ArrayList<Edge>[] A;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        A = new ArrayList[V+1];
        for(int i = 1; i <= V; i++) {
            A[i] = new ArrayList <Edge>();
        }

        for(int i = 0; i <= V; i++) {
            int S = sc.nextInt();
            while(true){
                int E = sc.nextInt();
                if(E == -1) break;
                int N = sc.nextInt();
                A[S].add(new Edge(E,N));
            }
        }

        distance = new int[V+1];
        visited = new boolean[V+1];
        BFS(1);

        int max = 1;
        for(int i = 2; i <= V; i++) {
            if(distance[max] < distance[i]) max = i;
        }

        distance = new int[V + 1];
        visited = new boolean[V + 1];
        BFS(max);
        Arrays.sort(distance);
        System.out.println(distance[V]);

    }

    private static void BFS(int i) {
        Queue<Integer> q = new LinkedList<Integer>();
        visited[i] = true;
        q.add(i);
        while (!q.isEmpty()) {
            int now_node = q.poll();
            for(Edge e : A[now_node]) {
                int k = e.e;
                int v = e.value;
                if(!visited[k]) {
                    visited[k] = true;
                    q.add(k);
                    distance[k] = distance[now_node] + v;
                }
            }
        }
    }

     static class Edge {
        int e;
        int value;
        public Edge(int e, int value) {
            this.e = e;
            this.value = value;
        }
    }
}
