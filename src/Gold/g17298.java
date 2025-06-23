package Gold;


import java.io.*;
import java.util.Stack;

// 오큰수 구하기 스택을 사용한 문제
// 오큰수의 정의는 오른쪽에 있는 숫자중에서 기준 숫자보다 큰수중에 가장 왼쪽에 있는 수이다.
public class g17298 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] ans = new int[N];
        String[] str = br.readLine().split(" ");

        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(str[i]);
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i = 0; i < N; i++){
            while(!stack.isEmpty() && A[stack.peek()] < A[i]){
                ans[stack.pop()] = A[i];
            }
            stack.push(i);
        }

        while(!stack.empty()){
            ans[stack.pop()] = -1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < N; i++){
            bw.write(ans[i]+" ");
        }
        bw.write("\n");
        bw.flush();

    }
}
