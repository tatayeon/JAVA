package Silver;

//구간합 구하는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s11659 {

    public static void main(String[] args) throws IOException {
        //받는 갯수가 많아지면 스캐너보다 BufferedReader가 좋다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine()); //입력의 갯수가 많아지면 사용

        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        long[]S = new long[suNo+1]; //int는 범위를 넘어갈 수 있다. +1은 index와 질의를 받을때의 차이를 줄이기 위해서


        stringTokenizer = new StringTokenizer(br.readLine());
        for(int i = 1; i <= suNo; i++){
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int q = 0; q < quizNo; q++){
            stringTokenizer = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j]-S[i-1]);
        }
    }
}
