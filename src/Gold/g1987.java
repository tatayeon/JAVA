package Gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class g1987 {
    static int R, C, ans = 1;
    static char[][] board;
    // 사방 이동
    static final int[] dr = {-1, 1, 0, 0};
    static final int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        board = new char[R][C];
        for (int i = 0; i < R; i++) {
            String line = br.readLine().trim();
            for (int j = 0; j < C; j++) board[i][j] = line.charAt(j);
        }
        int startMask = 1 << (board[0][0] - 'A');
        dfs(0, 0, startMask, 1);
        System.out.println(ans);
    }

    // r,c: 현재 위치 / used: 사용한 알파벳 비트 / depth: 현재까지 지난 칸 수
    static void dfs(int r, int c, int used, int depth) {
        ans = Math.max(ans, depth);
        // 가지치기(최대 남은 알파벳 수로 상한 추정) — 선택 사항
        // if (depth + (26 - Integer.bitCount(used)) <= ans) return;

        for (int k = 0; k < 4; k++) {
            int nr = r + dr[k], nc = c + dc[k];
            if (nr < 0 || nr >= R || nc < 0 || nc >= C) continue;
            int bit = 1 << (board[nr][nc] - 'A');
            if ((used & bit) != 0) continue; // 알파벳 중복 사용 금지
            dfs(nr, nc, used | bit, depth + 1);
        }
    }
}
