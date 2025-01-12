package Bronze;

import java.util.Scanner;
//조합 강의내용
public class b11050 {

    static int K, N;
    static int D[][];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        K = in.nextInt();
        D = new int[N+1][N+1]; //N개중 K개를 뽑았을때의 경우의 수를 표현해라

        for(int i=0; i<=N; i++){
            D[i][i] = 1;
            D[i][0] = 1;
            D[i][1] = i;
        }

        for(int i = 2; i<=N; i++){
            for(int j = 1; j < i; j++){
                D[i][j] = D[i-1][j-1] + D[i-1][j];
            }
        }

        System.out.println(D[N][K]);


    }

}
