package Glod;

import java.util.Arrays;
import java.util.Scanner;

//투포인터 활용

public class g1253 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count=0;
        int[] A = new int[N];

        for(int i = 0;i < N;i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        for(int k = 0;k < N;k++){
            int i = 0;
            int j = N-1;
            long find = A[k];
            while(i<j){
                if(find == A[i]+A[j]){
                    if(i != k && j != k){
                        count++;
                        break;
                    } else if (i==k) {
                        i++;
                    }else if(j==k){
                        j--;
                    }
                }else if(find>A[i]+A[j]){
                    i++;
                }else if(find<A[i]+A[j]){
                    j--;
                }
            }
        }
        System.out.println(count);
    }
}
