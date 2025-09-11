import java.util.Scanner;

public class problem02MaxInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type positive number # ");
        int number = input.nextInt();

        int max = -1;
        int count = 0;
        int idx = 0;
        if (number > 0) {
            while (number > 0) {
                int temp = number % 10;
                count++;
                if (temp >= max) {
                    max = temp;
                    idx = count - 1;
                }
                number /= 10;
            }
            System.out.printf("Positive integer - %d is at position - %d", max, count - idx);
        } else {
            System.out.println("Type only positive number.");
        }

        input.close();
    }
}