package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class b14726 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String answer = "";

        for (int i = 0; i < num; i++) {
            String number = br.readLine();
            int sum = 0;

            for (int j = number.length() - 1; j >= 0; j--) {
                char ch = number.charAt(j);
                int count = 0;
                int odd = 0;

                if ((16 - j) % 2 != 0){
                    count += Integer.parseInt("" + number.charAt(j));
                }else{
                    odd = Integer.parseInt("" + number.charAt(j)) * 2;

                    if (odd >= 10){
                        count += 1 + (odd % 10);
                    }else{
                        count += odd;
                    }
                }
                sum += count;
            }

            if (sum % 10 == 0){
                answer = "T";
            }else{
                answer = "F";
            }

            sb.append(answer).append("\n");
        }

        System.out.println(sb.toString());
    }
}
