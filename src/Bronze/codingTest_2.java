package Bronze;

public class codingTest_2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 23;
        numbers[2] = 1123;
        numbers[3] = 123;
        numbers[4] = 234;
        numbers[5] = 345;
        numbers[6] = 456;
        numbers[7] = 789;
        numbers[8] = 98722;
        numbers[9] = 999;

        int maxLength = 0;
        for (int i = 0; i < numbers.length; i++) {
            int value = numbers[i];
            int targetLength = String.valueOf(value).length();
            if (maxLength < targetLength) {
                maxLength = targetLength;
            }
        }

        for (int num : numbers) {
            String padded = String.format("%0" + maxLength + "d", num);
            System.out.println(padded);
        }

    }
}
