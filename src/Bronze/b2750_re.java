package Bronze;

import java.util.Scanner;

public class b2750_re {
    public static void main(String[] args) {
        //버블 정렬로 수 정렬하기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 전체 갯수 지정
        int[] arr = new int[n];
        for(int i =0 ; i<n ; i++){ //정해진 수만큼 수 받아주기
            arr[i] = sc.nextInt();
        }

        //버블 정렬 시작
        for(int i=0 ; i < n ; i++){
            for(int j = i+1 ; j<n ; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
