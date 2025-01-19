package Silver;

import java.util.Scanner;

public class s1541 {
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String example = sc.nextLine();
        String[] str = example.split("-"); //split하면 이 문자를 기준으로 짤라준다.
        for(int i = 0 ; i < str.length ; i++){
            int temp = mySum(str[i]);
            if(i==0){
                answer += temp;
            }else {
                answer -= temp;
            }
        }
        System.out.println(answer);
    }

    private static int mySum(String a) {
        int sum = 0;
        String[] temp = a.split("[+]"); // + 를 잘 인식을 못할때는 대괄호를 집어넣어서 인식을 시켜줄 수 있다.
        for(int i = 0 ; i < temp.length ; i++){
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }
}
