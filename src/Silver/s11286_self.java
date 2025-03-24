package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 우선순위 큐를 활용한 문제
// 우선순위 큐에서 어떻게 조건을 걸어주는지 확인
public class s11286_self {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) ->{
            int first_num = Math.abs(o1);
            int second_num = Math.abs(o2);
            if(first_num == second_num) {
                return o1 > o2 ? 1 : -1;
            };
            return first_num - second_num;
        });

        for(int i=0;i<N;i++) {
            int num = Integer.parseInt(br.readLine());
            if(num==0) {
                if(!myQueue.isEmpty()) {
                    System.out.println(myQueue.poll());
                }else System.out.println("0");
            }else myQueue.add(num);

        }


    }

}
