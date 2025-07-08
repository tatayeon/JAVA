package Bronze;

import java.util.Arrays;
import java.util.Scanner;

public class b2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int K = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            K += arr[i];
        }
        Arrays.sort(arr);
        int remove1 = -1;
        int remove2 = -1;

        for(int i = 0; i < 9; i++){
            for(int j = i+1; j<9; j++){
                if(K - arr[i] - arr[j] == 100){ // 초기화 문제를 이렇게 해결해 보자
                    remove1 = i;
                    remove2 = j;
                    break;
                }
            }
            if (remove1 != -1) break;
        }

        for (int i = 0; i < 9; i++) {
            if (i == remove1 || i == remove2) continue;
            System.out.println(arr[i]);
        }
    }
}
