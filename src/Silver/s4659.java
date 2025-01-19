package Silver;
//비밀번호 발음하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s4659 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                String s = br.readLine();
                if (s.equals("end")) {
                    break;
                }

                char[] arr = s.toCharArray();

                boolean containsVowels = false; // 모음 포함 검사 변수
                boolean threeTimesInARow = false; // 모음 or 자음 세 번 연속일 경우
                int vowelsInARowCount = 0; // 연속으로 나온 모음 횟수
                int consonantsInARowCount = 0; // 연속으로 나온 자음 횟수
                boolean doubleInARowCheck = false; // 같은 글자 연속 두번 체크 변수

                for (int i = 0; i < arr.length; i++) {
                    // 1번, 2번 검사
                    if (vowelCheck(arr[i])) { // 모음일 때
                        containsVowels = true; // 모음 포함
                        vowelsInARowCount++;
                        consonantsInARowCount = 0;
                    } else { // 자음일 때
                        consonantsInARowCount++;
                        vowelsInARowCount = 0;
                    }
                    if (vowelsInARowCount >= 3 || consonantsInARowCount >= 3) {
                        threeTimesInARow = true;
                        break;
                    }

                    // 3번 검사
                    if (i >= 1) {
                        if (arr[i - 1] == arr[i]) {
                            if (arr[i] == 'e') {
                                continue;
                            } else if (arr[i] == 'o') {
                                continue;
                            }
                            doubleInARowCheck = true;
                            break;
                        }
                    }
                }

                StringBuilder sb = new StringBuilder();
                sb.append("<");
                for (int j = 0; j < arr.length; j++) {
                    sb.append(arr[j]);
                }
                sb.append("> is ");
                if (!containsVowels || threeTimesInARow || doubleInARowCheck) {
                    sb.append("not ");
                }
                sb.append("acceptable.");

                System.out.println(sb);
            }
        }

        static boolean vowelCheck(char c) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return true;
            }
            return false;
        }
}

