package Silver;

//구간합 구하는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

public class s11659 {

    public static void main(String[] args) throws IOException {
        //초기 선언부
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int soNo = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());
        long[] S = new long[soNo+1];
        st = new StringTokenizer(br.readLine());

        for(int i = 1; i<=soNo; i++){
            // 질의 개수만큼 반복하면서 합배열 생성하기
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i<=quizNo; i++){
            // 숫자 범위를 입력을 받고
            // 그 사이의 구간합을 공식으로 구해낸다.
            st = new StringTokenizer(br.readLine());
            int j = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            System.out.println(S[q] - S[j -1]);
        }
    }
}
