package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s1018_2 {
    static int M, N;
    static char[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        board = new char[M][N];
        for(int i = 0; i < M; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            String line = st1.nextToken().trim();
            for(int j = 0; j < N; j++){
                board[i][j] = line.charAt(j);
            }
        }

        int answer = Integer.MAX_VALUE;
        for(int i = 0; i < M -8; i++){
            for(int j = 0; j < N-8; j++){
                answer = Math.min(answer, repaintCost2(i, j));
            }
        }
        System.out.println(answer);

    }

    private static int repaintCost2(int r, int c) {
        int cntB = 0;
        int cntW = 0;
        for(int k = 0; k < 8; k++){
            for(int j = 0; j < 8; j++){
                char cur = board[r+k][c+j];
                boolean even = ((k + j) & 1) == 0;
                char expectedW = even ? 'W' : 'B';
                if (cur != expectedW) cntW++;
                char expectedB = even ? 'B' : 'W';
                if (cur != expectedB) cntB++;
            }
        }
        return Math.min(cntB, cntW);
    }

}
