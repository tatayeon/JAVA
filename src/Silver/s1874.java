package Silver;

import java.util.Scanner;
import java.util.Stack;
// 스택을 활용한 문제
// 스택으로 오름차운 수열 만들기
public class s1874 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();
        int num = 1;
        boolean flag = true;

        for(int i = 0; i < A.length; i++){
            int su = A[i];
            if(su >= num){
                while(su >= num){
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }else{
                int n = stack.pop();
                if(n > su){
                    System.out.println("NO");
                    flag = false;
                    break;
                }else{
                    bf.append("- \n");
                }
            }
        }
        if(flag) System.out.println(bf.toString());


    }

}
