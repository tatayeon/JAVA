package Silver;

import java.io.IOException;
import java.util.*;

public class s1260_self2 {

    static boolean visited[];
    static ArrayList<Integer>[] A;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Start = sc.nextInt();

        A = new ArrayList[N+1];
        for(int i = 1; i <= N; i++){
            A[i] = new ArrayList<>();
        }

        for(int i = 1; i < M; i++){
            int S = sc.nextInt();
            int E = sc.nextInt();
            A[S].add(E);
            A[E].add(S);
        }

        for(int i = 1; i <= N; i++){
            Collections.sort(A[i]);
        }

        visited = new boolean[N+1];
        DFS(Start);
        System.out.println();

        visited =new boolean[N+1];
        BFS(Start);
    }

    private static void BFS(int Node) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(Node);
        visited[Node] = true;

        while(!q.isEmpty()){
            int now_Node = q.poll();
            System.out.print(now_Node + " ");

            for(int i : A[now_Node]){
                if(!visited[i]){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }

    }

    private static void DFS(int Node) {
        System.out.print(Node+" ");
        visited[Node] = true;
        for(int i : A[Node]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }


}
