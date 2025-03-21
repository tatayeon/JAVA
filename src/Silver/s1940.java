package Silver;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 주몽의 명령
// 투포인트를 활용한 문제
// 투포인트에서 중요한 점은 각각의 시점에 따라서 어떤 포인터가 어떻게 움직여야 하는지가 중요하다.

public class s1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 재료의 개수
        int M = Integer.parseInt(br.readLine()); // 갑옷이 되는 번호 저장
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int start_point = 0;
        int end_point = N-1;
        int count = 0;

        while(start_point < end_point){
            if(A[start_point] + A[end_point] > M){
                end_point--;
            }else if(A[start_point] + A[end_point] < M) {
                start_point++;
            }else{
                end_point--; start_point++; count++;
            }
        }

        System.out.println(count);


    }
}
