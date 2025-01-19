package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class s11286 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) -> {
            //이렇게 하면 우선순위를 커스텀 할 수 있다.
            int frist_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if(frist_abs == second_abs){  //절댓값이 같은 경우 음수 리턴
                return o1 > o2 ? 1:-1;

            }
            return frist_abs - second_abs; //절댓값이 작은 데이터 우선
        }); //우선순위 큐 선언

        for(int i=0;i<N;i++){
            int requst = Integer.parseInt(br.readLine());
            if(requst == 0){
                if(myQueue.isEmpty()){
                    System.out.println("0");
                }else{
                    System.out.println(myQueue.poll());
                }
            }else {
                myQueue.add(requst);
            }
        }



    }
}
