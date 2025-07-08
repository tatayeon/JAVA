package Bronze;

import java.util.Scanner;

public class b10988_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();

        int start = 0;
        int end = s.length() - 1;
        for(int i = 0; i < s.length(); i++){
            if(ch[start] != ch[end]){
                System.out.println("0");
                break;
            }else {
                start++;
                end--;
                if(start == end || start > end){
                    System.out.println("1");
                    break;
                }
            }
        }
    }
}
