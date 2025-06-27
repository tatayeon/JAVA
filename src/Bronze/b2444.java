package Bronze;

import java.util.Scanner;
// repeat 주어진 파라미터수 만큼 횟수 반복
public class b2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = n - 1;

        for(int i = 1; i <= 2 * n - 1; i++){
            for(int j = 0; j < space; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < star; k++){
                System.out.print("*");
            }
            System.out.println();

            if(i < n){ // 중간 전까지 별 업 공백 다운
                star += 2;
                space -= 1;
            }else{ // 중간 이후 별 다운 공백 업
                star -= 2;
                space += 1;
            }
        }
    }
}