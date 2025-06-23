package Gold;  // 이건 잘못된 패키지 이름입니다. 'Gold'로 수정하는 게 좋습니다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class g1753 {

    public static int V, E, K; // 정점 수, 간선 수, 시작 정점
    public static int distance[]; // 최단 거리 저장 배열
    public static boolean visited[]; // 방문 여부 체크 배열
    public static ArrayList<Edge> list[]; // 인접 리스트: 각 정점에 연결된 간선 정보 저장
    public static PriorityQueue<Edge> q = new PriorityQueue<>(); // 우선순위 큐: 현재 가장 짧은 거리의 노드를 꺼내기 위함

    public static void main(String[] args) throws IOException {

        // 입력을 빠르게 받기 위한 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 정점 수(V), 간선 수(E) 입력
        st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        // 시작 정점(K) 입력
        K = Integer.parseInt(br.readLine());

        // 배열 초기화
        distance = new int[V + 1]; // 1번부터 V번까지 사용하므로 V+1 크기
        visited = new boolean[V + 1]; // 방문 체크 배열
        list = new ArrayList[V + 1]; // 인접 리스트 배열

        // 인접 리스트 초기화
        for (int i = 1; i <= V; i++) {
            list[i] = new ArrayList<>();
        }

        // 최단 거리 배열을 무한대로 초기화
        for (int i = 0; i <= V; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        // 간선 정보 입력 받기
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()); // 출발 노드
            int v = Integer.parseInt(st.nextToken()); // 도착 노드
            int w = Integer.parseInt(st.nextToken()); // 가중치
            list[u].add(new Edge(v, w)); // u → v 가중치 w인 간선을 인접 리스트에 저장
        }

        // 다익스트라 알고리즘 시작

        q.add(new Edge(K, 0)); // 시작 정점을 우선순위 큐에 넣음 (거리 0)
        distance[K] = 0; // 시작 정점까지 거리는 0으로 설정

        while (!q.isEmpty()) {
            Edge current = q.poll(); // 현재 거리 가장 짧은 정점 꺼내기
            int c_v = current.vertex; // 현재 정점 번호

            // 이미 방문한 노드는 무시
            if (visited[c_v]) continue;
            visited[c_v] = true;

            // 현재 정점과 연결된 모든 정점 확인
            for (int i = 0; i < list[c_v].size(); i++) {
                Edge tmp = list[c_v].get(i); // 인접한 정점 정보
                int next = tmp.vertex; // 다음 정점
                int value = tmp.value; // 가중치

                // 기존보다 더 짧은 경로 발견 시 갱신
                if (distance[next] > distance[c_v] + value) {
                    distance[next] = distance[c_v] + value;
                    q.add(new Edge(next, distance[next])); // 우선순위 큐에 갱신된 거리로 추가
                }
            }
        }

        // 최종 거리 출력
        for (int i = 1; i <= V; i++) {
            if (visited[i])
                System.out.println(distance[i]); // 방문된 정점은 최단 거리 출력
            else
                System.out.println("INF"); // 연결되지 않은 정점은 무한(INF) 출력
        }
    }
}

// 간선 정보를 담는 클래스
class Edge implements Comparable<Edge> {
    int vertex; // 도착 정점
    int value;  // 해당 정점까지의 거리 또는 가중치

    Edge(int vertex, int value) {
        this.vertex = vertex;
        this.value = value;
    }

    // 우선순위 큐 정렬 기준 (거리 오름차순)
    public int compareTo(Edge o) {
        return Integer.compare(this.value, o.value); // 거리가 짧은 게 먼저
    }
}