package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//구간합 구하기 2
//2차원에서 구간합 배열을 채우는 공식
// = D[i][j] = A[i][j] + D[i-1][j] + D[i][j-1] - D[i-1][j-1];
// 구간합 배열을 사용해서 결과를 구하는 공식
// = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] +D[x1-1][y1-1];
public class s11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //배열의 크기 받기
        int M = Integer.parseInt(st.nextToken()); //질의 수 받기
        int A[][] = new int[N+1][N+1]; //원본 배열 생성

        // 원본 배열 생성하기
        for(int i = 1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1;j<=N;j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 구간합 배열 생성및 값 채우기
        int D[][] = new int[N+1][N+1];
        for(int i = 1;i<=N;i++){
            for(int j = 1;j<=N;j++){
                // 이 공식 기억하기
                D[i][j] = A[i][j] + D[i-1][j] + D[i][j-1] - D[i-1][j-1];
            }
        }

        for(int i = 0; i <M; i++){
            //위에서 이미 합 배열을 모두 채워놨다 그래서 이렇게 들어온 질의에 대해서 합배열의 공식을 사용해서 구해준다.
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int result = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] +D[x1-1][y1-1];
            System.out.println(result);
        }
    }
}
