package Bronze;

import java.util.Scanner;

public class b10988 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String temp = "";
        int result = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            temp = temp + s.charAt(i);
            if(temp.equals(s)){
                result = 1;
                break;
            }
        }

        System.out.println(result);


    }
}
