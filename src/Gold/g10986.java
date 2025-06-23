package Gold;

import java.util.Scanner;

// 나머지 합 구하기
public class g10986 {
    public static void main(String[] args) {
        // 문제에 필요한 것들 선언부
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        if (N == 0) {
            System.out.println(0);
            return;
        }

        long[] S = new long[N];
        long[] C = new long[M];
        long answer = 0;

        S[0] = sc.nextInt();
        // 합 배열 구하기
        for(int i = 1; i < N; i++){
            S[i] = S[i-1] + sc.nextInt();
        }

        // 우리가 저장한 합배열에서 M으로 나눠서 나머지가 0인 것에 더해서 표시를 한다 (증가시킨다.)
        for(int i = 0; i < N; i++){
            int remainder = (int) ((S[i] % M + M) % M);  // 음수 방지
            if(remainder == 0){
                answer++;
            }
            C[remainder]++;
        }

        // 이제 위에서 표시한 것을 뽑아서 오는데 여기서 2가지를 뽑는 경우의 수를 정답에 더한다.
        for(int i = 0; i < M; i++){
            if(C[i] > 1){
                answer = answer + (C[i] * (C[i] -1) / 2);
            }
        }

        System.out.println(answer);
    }
}
