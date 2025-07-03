package Silver;

import java.util.Scanner;
//소수의 개념 1과 자기 자신으로 밖에 나눠지지 않는 수
public class s1929_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[N+1];

        for (int i = 2; i <= N; i++) {
            A[i] = i;
        }

        for(int i = 2; i <= Math.sqrt(N); i++) {
            if(A[i] == 0) continue;
            for (int j = i+i; j <= N; j = j+i) { // 그냥 배수를 찾아가서 지우는 방식으로 구현
                A[j] = 0;
            }
        }

        for(int i = M; i <= N; i++) {
            if(A[i] != 0) System.out.println(A[i]);
        }

    }
}
