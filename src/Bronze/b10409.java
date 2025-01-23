package Bronze;

import java.util.Scanner;

public class b10409 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of tasks and total time
        int N = sc.nextInt();
        int T = sc.nextInt();
        int count = 0;

        // Loop through the tasks
        for (int i = 0; i < N; i++) {
            int taskTime = sc.nextInt();

            if (T >= taskTime) {  // Check if task can be completed
                T -= taskTime;   // Deduct the time taken by the task
                count++;         // Increment completed task count
            } else {
                break;           // Stop if the remaining time is insufficient
            }
        }

        // Output the result
        System.out.println(count);
    }
}
