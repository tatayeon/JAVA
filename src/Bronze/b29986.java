package Bronze;

import java.util.Scanner;

public class b29986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //놀이 공원의 수를 받고
        int M = sc.nextInt(); //타겟 키
        int count=0;

        for(int i=0;i<N;i++){
            int target = sc.nextInt();
            if(target <= M){
                count++;
            }
        }
        System.out.println(count);
    }
}
