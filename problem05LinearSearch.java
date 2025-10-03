import java.util.Scanner;

public class problem05LinearSearch {

    public static void main(String[] Args) {
        int[] array = { 1, 2, 3, 4, 5, 25, 30, 75, 90 };
        boolean found = false;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. Find\n2. Exit");
            int opt = input.nextInt();

            if (opt == 1) {
                System.out.print("Type number # ");
                int number = input.nextInt();

                for (int i = 0; i < array.length; i++) {
                    if (array[i] == number) {
                        System.out.printf("Number # %d is at index %d. \n", array[i], i);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.printf("Number # %d does not exist in an array. \n", number);
                }
            } else {
                System.out.println("Exiting");
                break;
            }
        }
        input.close();
    }
}
