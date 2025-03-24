package Bronze;

import java.util.Scanner;

//버블 정령
public class b2750_self {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        // 버블 정렬 알고리즘
        for (int i = 0; i < N - 1; i++) { // N-1번 반복
            for (int j = 0; j < N - i - 1; j++) { // 인접한 두 수 비교
                if (A[j] > A[j + 1]) {
                    // swap
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i < N; i++){
            System.out.println(A[i]);
        }


    }

}
