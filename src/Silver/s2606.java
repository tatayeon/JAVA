package Silver;

import java.util.ArrayList;
import java.util.Scanner;

public class s2606 {

    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 컴퓨터 수
        int M = sc.nextInt(); // 연결된 컴퓨터 수

        //1. 먼저 컴퓨터 수 만큼 리스트 초기화
        A = new ArrayList[N+1];
        for(int i = 1; i<=N; i++){
            A[i] = new ArrayList<>();
        }

        // 2. 연결된 컴퓨터 수 만큼 리스트 채우기
        for(int i = 0; i < M; i++){
            int S = sc.nextInt();
            int E = sc.nextInt();
            A[S].add(E);
            A[E].add(S);
        }
        visited = new boolean[N+1];
        count = 0;
        dfs(1);
        System.out.println(count);

    }

    private static void dfs(int i) {
        visited[i] = true;
        for(int k : A[i]){
            if(!visited[k]){
                count++;
                dfs(k);
            }
        }
    }
}
