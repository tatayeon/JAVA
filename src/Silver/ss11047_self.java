package Silver;

import java.util.Scanner;

public class ss11047_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[N];
        int ans = 0;

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = N-1; i >= 0; i--){
            if(arr[i] <= target){
                ans += target / arr[i];
                target = target % arr[i];
            }
        }
        System.out.println(ans);
    }
}
