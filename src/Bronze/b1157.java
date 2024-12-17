package Bronze;

import java.util.Scanner;

public class b1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int [] arr;

        for(int i = 0; i < testCase; i++){
            int N = sc.nextInt();
            arr = new int[N];
            double sum = 0;
            double avg = 0;
            for(int j = 0; j < N; j++){
                arr[j] = sc.nextInt();
                sum += arr[j];
                avg = sum/N;
            }
            double count = 0;
            for(int j = 0; j < N; j++){
                if(arr[j] > avg){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count/N)*100);
        }

    }
}
