package Silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//Counting Sort 예제
public class s2751 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        // –1,000,000 ~ +1,000,000 을 0~2,000,000 인덱스로 매핑
        boolean[] present = new boolean[2_000_001];
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            present[x + 1_000_000] = true;
        }
        // 출력
        for (int i = 0; i < present.length; i++) {
            if (present[i]) {
                bw.write((i - 1_000_000) + "\n");
            }
        }
        bw.flush();
    }
}
