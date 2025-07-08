package Bronze;

import java.util.Scanner;

public class b2979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); //1대
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[][] arr = new int[3][2];
        int[] S = new int[100];
        int result = 0;

        for(int i = 0; i < 3; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for(int i = 0; i < 3; i++){
            for(int j = arr[i][0]; j < arr[i][1]; j++){
                S[j]++;
            }
        }

        for(int i = 0; i < S.length; i++){
            if(S[i] ==3){
                result += S[i] * C;
            }else if(S[i] == 2){
                result += S[i] * B;
            }else if(S[i] == 1){
                result += S[i] * A;
            }else{
                continue;
            }
        }

        System.out.println(result);
    }
}
