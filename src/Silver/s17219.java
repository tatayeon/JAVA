package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


/* Map을 활용한 사전같은 느낌*/
public class s17219 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            map.put(str[0], str[1]); // 사이트, 비밀번호
        }

        for (int i = 0; i < M; i++) {
            String site = br.readLine();
            System.out.println(map.get(site));
        }

    }

}
