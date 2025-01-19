package Silver;

//듣보잡

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class s1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);

        // HashSet으로 중복 탐색 효율화
        HashSet<String> A = new HashSet<>(N);
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            A.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (A.contains(name)) { // O(1) 탐색
                result.add(name);
            }
        }

        // 결과 리스트 정렬
        Collections.sort(result);
        System.out.println(result.size());
        for (String name : result) {
            System.out.println(name);
        }
    }
}
