package Silver;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class s11279 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 최대 힙 : 큰 수가 먼저 나오도록 설정
        PriorityQueue<Integer> myQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < N; i++){
            int temp = sc.nextInt();
            if(temp == 0){
                if(myQueue.isEmpty()){
                    System.out.println(0);
                } else {
                    System.out.println(myQueue.poll());
                }
            } else {
                myQueue.add(temp);
            }
        }
    }
}