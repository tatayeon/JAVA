package Silver;

import java.util.Scanner;

public class s11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] S = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            int insert_index = i;
            int insert_val = A[i];
            for(int j = i-1; j >= 0; j--){
                if(A[j] < A[i]){
                    insert_index = j+1;
                    break;
                }
                if(j==0){
                    insert_index = 0;
                }
            }
            for(int j = i; j > insert_index; j--){
                A[j] = A[j-1];
            }
            A[insert_index] = insert_val;
        }
        S[0] = A[0];
        for(int i = 1; i < N; i++){ //합배열
            S[i] = S[i-1] + A[i];
        }
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum = sum + S[i];
        }

        System.out.println(sum);
    }
}
