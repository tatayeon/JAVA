package Silver;

import java.util.Scanner;
//그리드 알고리즘 그리드 알고리즘은 항상 최선의 값을 도출해 내는 알고리즘이다.
public class s11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] <= K){
                count += K / arr[i];
                K = K % arr[i];
            }
        }
        System.out.println(count);



    }
}
