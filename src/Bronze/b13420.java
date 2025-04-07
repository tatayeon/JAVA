package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b13420 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 첫 줄: 테스트 케이스 수

        for (int i = 0; i < N; i++) {
            String line = br.readLine(); // 한 줄 전체 읽기 (예: "3 * 2 = 6")
            String[] parts = line.split(" "); // ["3", "*", "2", "=", "6"]

            int a = Integer.parseInt(parts[0]);
            String op = parts[1];
            int b = Integer.parseInt(parts[2]);
            int result = Integer.parseInt(parts[4]);

            boolean isCorrect = false;

            switch (op) {
                case "+":
                    isCorrect = (a + b == result);
                    break;
                case "-":
                    isCorrect = (a - b == result);
                    break;
                case "*":
                    isCorrect = (a * b == result);
                    break;
                case "/":
                    isCorrect = (a / b == result);
                    break;
            }

            System.out.println(isCorrect ? "correct" : "wrong answer");
        }
    }
}