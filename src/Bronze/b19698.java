package Bronze;

import java.util.Scanner;
//헛간 청약 문제
public class b19698 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //소들의 수
        int W = sc.nextInt(); // 헛간의 가로
        int H = sc.nextInt(); // 헛간의 세로
        int L = sc.nextInt(); // 배정되는 공간의 크기

        int total_W = W - (W % L);
        int total_H = H - (H % L);
        int result = (total_W * total_H) / (L*L);

        if(N > result){
            System.out.println(result);
        }else System.out.println(N);

    }
}
