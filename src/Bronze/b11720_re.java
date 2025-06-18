package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11720_re {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String total = br.readLine();
        char[] arr = total.toCharArray();

        int result = 0;
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(String.valueOf(arr[i]));
            result += temp;
        }
        System.out.println(result);
    }

}
