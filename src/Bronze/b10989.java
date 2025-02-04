package Bronze;

import java.io.*;
import java.util.Arrays;

public class b10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] count = new int[10_001]; // 1~10,000의 숫자 등장 횟수 저장

        // 입력값 카운팅
        for (int i = 0; i < N; i++) {
            count[Integer.parseInt(br.readLine())]++;
        }

        // 정렬된 결과 출력
        for (int i = 1; i <= 10_000; i++) {
            while (count[i]-- > 0) { // 해당 숫자가 존재하는 만큼 출력
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
