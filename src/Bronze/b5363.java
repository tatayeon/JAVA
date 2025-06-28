package Bronze;

import java.util.Scanner;

public class b5363 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int T = sc.nextInt(); // 테스트 케이스 수
            sc.nextLine(); // 개행 소비

            for (int i = 0; i < T; i++) {
                String line = sc.nextLine();
                String[] words = line.split(" ");

                // 앞 2개 빼고 뒤에 붙이기
                StringBuilder sb = new StringBuilder();
                for (int j = 2; j < words.length; j++) {
                    sb.append(words[j]).append(" ");
                }
                sb.append(words[0]).append(" ").append(words[1]);

                System.out.println(sb.toString());
            }
        }
}
