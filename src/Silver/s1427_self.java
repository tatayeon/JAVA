package Silver;

import java.util.Arrays;
import java.util.Scanner;
//선택 정렬
//선택 정렬은 왼쪽 기준점은 이미 정렬이 완료 되어 있다고 생각하고 정렬을 하는 방법이다 N의 제곱으로 진행이 된다
public class s1427_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int A[] = new int[str.length()];

        for(int i = 0; i < str.length(); i++){
            A[i] = Integer.parseInt(str.substring(i, i+1));
        }

        for(int i = 0 ; i < str.length(); i++){
            int Max = i; //인덱스로 생각하는 것이 중요함
            for(int j = i+1 ; j < str.length(); j++){
                if(A[Max] < A[j]){ //왼쪽의 정렬이 안된 공간을 탐색하는 과정
                    Max = j;
                }
            }
            if(A[Max] > A[i]){
                int temp = A[i];
                A[i] = A[Max];
                A[Max] = temp;
            }
        }

        for(int i = 0 ; i < str.length(); i++){
            System.out.print(A[i]);
        }


    }
}
