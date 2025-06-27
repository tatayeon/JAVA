package Bronze;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class b5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < 28; i++) {
            int input = sc.nextInt();
            countMap.put(input, countMap.getOrDefault(input, 1) + 1);
        }

        for(int i = 1; i <= 30; i++){
            if(!countMap.containsKey(i)){
                System.out.println(i);
            }
        }
    }
}
