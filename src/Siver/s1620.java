package Siver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class s1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] arr = new String[N]; // 숫자로 찾기 위한 배열
        HashMap<String, Integer> map = new HashMap<>(); // 이름으로 찾기 위한 Map

        for (int i = 0; i < N; i++) {
            String name = bf.readLine();
            arr[i] = name; // 배열에 이름 저장
            map.put(name, i + 1); // 이름을 키로 하고 인덱스(+1)를 값으로 저장
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String query = bf.readLine();
            if (Character.isDigit(query.charAt(0))) {
                // 숫자일 경우 배열에서 검색
                int index = Integer.parseInt(query);
                sb.append(arr[index - 1]).append("\n");
            } else {
                // 문자일 경우 Map에서 검색
                sb.append(map.get(query)).append("\n");
            }
        }

        System.out.println(sb); // 출력
    }
}
