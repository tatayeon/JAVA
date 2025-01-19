package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s10709 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄에서 H와 W 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        // H x W 크기의 map 배열 선언
        int[][] map = new int[H][W];

        for (int i = 0; i < H; i++) {
            String line = br.readLine();
            int lastCloud = -1; // 마지막으로 'c'가 나타난 위치 저장
            for (int j = 0; j < W; j++) {
                if (line.charAt(j) == 'c') {
                    map[i][j] = 0; // 'c'는 0
                    lastCloud = j; // 현재 위치를 마지막 'c'로 설정
                } else if (lastCloud == -1) {
                    map[i][j] = -1; // 'c'가 나타나지 않았으면 -1
                } else {
                    map[i][j] = j - lastCloud; // 현재 위치에서 마지막 'c'까지의 거리
                }
            }
        }




        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
