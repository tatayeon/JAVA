package Silver;

import java.util.*;

public class s2852 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int score1 = 0, score2 = 0; // 각 팀 점수
        int time1 = 0, time2 = 0;   // 각 팀 리드 시간(초)
        int prevTime = 0;           // 직전 득점 시각(초)

        for (int i = 0; i < N; i++) {
            int team = sc.nextInt();
            String[] t = sc.next().split(":");
            int curTime = Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);

            // 직전 득점 이후 ~ 이번 득점 직전까지의 리드 시간 계산
            if (score1 > score2) {
                time1 += curTime - prevTime;
            } else if (score2 > score1) {
                time2 += curTime - prevTime;
            }

            // 점수 반영
            if (team == 1) score1++;
            else score2++;

            prevTime = curTime; // 시각 갱신
        }

        // 마지막 득점 이후 ~ 경기 종료(48분 = 2880초)까지 반영
        if (score1 > score2) {
            time1 += 2880 - prevTime;
        } else if (score2 > score1) {
            time2 += 2880 - prevTime;
        }

        // 출력 (MM:SS 형식)
        System.out.println(formatTime(time1));
        System.out.println(formatTime(time2));
    }

    private static String formatTime(int totalSeconds) {
        int m = totalSeconds / 60;
        int s = totalSeconds % 60;
        return String.format("%02d:%02d", m, s);
    }
}