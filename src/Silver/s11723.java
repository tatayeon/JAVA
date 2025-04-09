package Silver;

import java.io.*;
import java.util.*;

public class s11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" ");
            String cmd = input[0];

            if (cmd.equals("add")) {
                int x = Integer.parseInt(input[1]);
                set.add(x);
            } else if (cmd.equals("remove")) {
                int x = Integer.parseInt(input[1]);
                set.remove(x);
            } else if (cmd.equals("check")) {
                int x = Integer.parseInt(input[1]);
                sb.append(set.contains(x) ? "1\n" : "0\n");
            } else if (cmd.equals("toggle")) {
                int x = Integer.parseInt(input[1]);
                if (set.contains(x)) {
                    set.remove(x);
                } else {
                    set.add(x);
                }
            } else if (cmd.equals("all")) {
                set.clear();
                for (int x = 1; x <= 20; x++) {
                    set.add(x);
                }
            } else if (cmd.equals("empty")) {
                set.clear();
            }
        }

        System.out.print(sb);
    }
}