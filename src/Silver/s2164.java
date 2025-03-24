package Silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class s2164 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> myQueue = new LinkedList<>();

        for(int i=1; i<=n; i++){
            myQueue.add(i);
        }

        while(myQueue.size() > 1){
            myQueue.poll();
            int temp = myQueue.poll();
            myQueue.add(temp);
        }

        System.out.println(myQueue.poll());


    }
}
