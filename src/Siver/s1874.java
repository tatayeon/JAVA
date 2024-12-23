package Siver;

import java.util.Scanner;
import java.util.Stack;
// 스택으 ㄹ활용한 문제
public class s1874 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //먼저 배열의 갯수를 지정하고
        int A[] = new int[N]; // 배열 크게 맞게 배열을 만든다.
        for (int i = 0; i < N; i++) { // 그 다음에 배열에 값을 입력받아서 저장을 한다.
            A[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>(); // 스택을 선언한 다음에

        int num = 1;
        boolean flag = true;
        StringBuffer bf = new StringBuffer();
        for(int i = 0; i < A.length; i++) { // 배열의 크기에 맞춰서 맞는지 검사를 시작한다.
            int su = A[i]; //첫번째 숫자를 꺼내서 검사
            if(su >= num){ //만약 그 숫자(꺼낸숫자)가 넘보다 크면
                while (su >= num){ // 숫자를 ++해서 다시 스택에 하나 넣고 그다음에 push니깐 +출력해주고
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop(); // 만약에 아니야 그러면 꺼내서 - 출력을 해준다.
                bf.append("-\n");
            }else { //만약에 이 숫자가 작아 즉 오르차순으로 정렬을 하지 못하는 상황이야 그러면
                int n = stack.pop();
                if(n > su){ //NO를 출력해주면서 flag를 바꿔주면서 끝낸다.
                    System.out.println("NO");
                    flag = false;
                    break;
                }else {
                    bf.append("-\n");
                }
            }
        }

        if(flag){
            System.out.println(bf.toString());
        }


    }

}
