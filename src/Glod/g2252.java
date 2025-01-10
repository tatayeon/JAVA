package Glod;

//강의 내용 위상정렬 예제 문제

import java.util.*;

public class g2252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        for (int i = 0; i <= N; i++) {
            A.add(new ArrayList<>());
        }

        int indegree[] = new int[N+1];

        for(int i = 0; i < M; i++){
            int S = sc.nextInt();
            int E = sc.nextInt();
            A.get(S).add(E); //2에 진입차수가 추가가 된다.
            indegree[E]++; //진입차수 배열에 데이터저장을 한다.
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            if(indegree[i] == 0){ //해당 노드를 가르키는 것이 없다.
                queue.offer(i);

            }
        }

        while(!queue.isEmpty()){
            int now = queue.poll();
            System.out.print(now + " ");
            for(int next : A.get(now)){
                indegree[next]--;
                if(indegree[next] == 0){
                    queue.offer(next);
                }
            }
        }


    }
}
