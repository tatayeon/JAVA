package Silver;

import java.util.Scanner;
import java.util.Stack;

public class s9012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 테스트 케이스 수
        sc.nextLine(); // 버퍼 비우기

        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            boolean isVPS = true;

            for(int j = 0; j < s.length(); j++){
                char c = s.charAt(j);

                if(c == '(') {
                    stack.push(c);
                } else if(c == ')') {
                    if(stack.isEmpty()) {
                        isVPS = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if(!stack.isEmpty()) isVPS = false;

            System.out.println(isVPS ? "YES" : "NO");
        }

        sc.close();
    }
}