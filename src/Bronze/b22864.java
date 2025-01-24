package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class b22864 {
    public static void main(String[] args) throws IOException {
        // 입력
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String[] input = br.readLine().split(" ");
        int fatigueUpPerHour = Integer.parseInt(input[0]);
        int outputUpPerHour = Integer.parseInt(input[1]);
        int fatigueDownPerHour = Integer.parseInt(input[2]);
        int fatigueThroughput = Integer.parseInt(input[3]);

        // 출력
        System.out.print(findMaxOutput(fatigueUpPerHour, outputUpPerHour, fatigueDownPerHour, fatigueThroughput));
    }

    private static int findMaxOutput(int fatigueUpPerHour,
                                     int outputUpPerHour,
                                     int fatigueDownPerHour,
                                     int fatigueThroughput) {
        int ans = 0;
        int hour = 0;
        int ONE_DAY = 24;
        if (fatigueUpPerHour <= fatigueThroughput) {
            int cumulatedFatigue = 0;
            while (hour != ONE_DAY) {
                hour++;
                if ((cumulatedFatigue + fatigueUpPerHour) <= fatigueThroughput) {
                    ans += outputUpPerHour;
                    cumulatedFatigue += fatigueUpPerHour;
                } else {
                    if ((cumulatedFatigue - fatigueDownPerHour) >= 0) {
                        cumulatedFatigue -= fatigueDownPerHour;
                    } else {
                        cumulatedFatigue = 0;
                    }
                }
            }
        }
        return ans;
    }
}
