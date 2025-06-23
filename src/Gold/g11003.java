package Gold;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 슬라이딩 윈도우 활용
// 덱과 슬라이딩 윈도우를 사용한 최소값을 구하는 문제
// 이문제의 핵심은 빠른시간안에 정렬를 사용하는 것이 아닌 덱에 들어오는 순간부터
// 범위 안에 있는 숫자들을 가장 낮은 순서대로 집어 넣어 버리는 것이다.
// 이로써 덱 안에 있는 것들은 한상 최소 값으로 유지가 된다.

public class g11003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 숫자의 개수
        int L = Integer.parseInt(st.nextToken()); // 슬라이딩 윈도우 크기
        st = new StringTokenizer(br.readLine());

        Deque<Node> mydeque = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(st.nextToken());

            // 덱의 끝에서 현재 값보다 큰 값 제거 (오름차순 유지)
            while (!mydeque.isEmpty() && mydeque.getLast().value > now) {
                mydeque.removeLast();
            }

            // 새로운 노드 추가
            mydeque.addLast(new Node(now, i));

            // 윈도우 범위를 벗어난 노드 삭제
            if (mydeque.getFirst().index <= i - L) {
                mydeque.removeFirst();
            }

            // 현재 슬라이딩 윈도우에서 최소값 출력
            bw.write(mydeque.getFirst().value + " ");
        }

        bw.flush();
        bw.close();
    }

    // 내부 정적 클래스 Node 정의
    static class Node {
        int value;
        int index;

        public Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}