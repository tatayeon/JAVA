package Silver;

import java.io.IOException;
import java.util.*;

public class s1260_self {

    static boolean visioted[]; // 방문 확인 배열 생성
    static ArrayList<Integer>[] A; //각각 정점의 인접 리스트

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 정점의 개수
        int M = sc.nextInt(); // 간선의 개수
        int Start = sc.nextInt(); // 시작 노드 지정

        A = new ArrayList[N+1]; //각 정점의 갯수에 맞춰서 생성해 주고
        for(int i = 1; i <= N; i++){ // 초기화
            A[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < M; i++){ // 간선을 초기화 해준다 입력을 받아서 각 정점을 설정
            int S = sc.nextInt();
            int E = sc.nextInt();
            A[S].add(E);
            A[E].add(S);
        }

        for(int i = 1; i <= N; i++){
            Collections.sort(A[i]);
        }
        visioted = new boolean[N+1];
        DFS(Start);
        System.out.println(" ");
        visioted = new boolean[N+1];
        BFS(Start);

    }

    private static void DFS(int Node) {
        System.out.print(Node + " ");
        visioted[Node] = true;
        for(int i : A[Node]){
            if(!visioted[i]){
                DFS(i);
            }
        }
    }

    private static void BFS(int Node) {
        Queue<Integer> q = new LinkedList<>();
        q.add(Node);
        visioted[Node] = true;

        while(!q.isEmpty()){
            int now_Node = q.poll();
            System.out.print(now_Node + " ");
            for(int i : A[now_Node]){
                if(!visioted[i]){
                    visioted[i] = true;
                    q.add(i);
                }
            }
        }

    }
}
