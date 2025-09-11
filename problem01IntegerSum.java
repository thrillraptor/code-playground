import java.util.Scanner;

public class problem01IntegerSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type positive integer number - ");
        int number = input.nextInt();

        int sum = 0;
        if (number > 0) {
            while (number >= 1) {
                int temp = number % 10;
                sum += temp;
                number = number / 10;
            }
            System.out.printf("Your integer sum - %d", sum);
        } else {
            System.out.println("Only positive integer number.");
        }

        input.close();
    }
}