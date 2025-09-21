package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s1018 {
    static int N, M;
    static char[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        board = new char[M][N];
        for (int i = 0; i < M; i++) {
            String line = br.readLine().trim();
            for (int j = 0; j < N; j++) board[i][j] = line.charAt(j);
        }

        int answer = Integer.MAX_VALUE;
        for (int r = 0; r <= M - 8; r++) {
            for (int c = 0; c <= N - 8; c++) {
                answer = Math.min(answer, repaintCost(r, c));
            }
        }
        System.out.println(answer);

    }

    // (sr, sc)를 좌상단으로 하는 8x8의 최소 칠하기 수
    static int repaintCost(int sr, int sc) {
        int cntW = 0, cntB = 0; // 시작이 W인 경우 / B인 경우
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char cur = board[sr + i][sc + j];
                // (i+j) 짝수면 시작색, 홀수면 반대색이어야 함
                boolean even = ((i + j) & 1) == 0;

                // 시작색 W 가정
                char expectedW = even ? 'W' : 'B';
                if (cur != expectedW) cntW++;

                // 시작색 B 가정
                char expectedB = even ? 'B' : 'W';
                if (cur != expectedB) cntB++;
            }
        }
        return Math.min(cntW, cntB);
    }
}
