import java.util.Scanner;

public class problem04ArrayInsertionAndDeletion {

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int count = 0;

        while (true) {
            System.out.println("1. Display\n2. Insert\n3. Delete\n4. Quit");
            System.out.print("Option: ");
            int option = input.nextInt();
            if (option == 1) {

                System.out.print("{ ");
                for (int i = 0; i < numbers.length; i++) {
                    System.out.printf("%d", numbers[i]);
                    if (i != numbers.length - 1) {
                        System.out.print(" | ");
                    }
                }
                System.out.println(" }");

            } else if (option == 2) {
                if (count < numbers.length) {
                    System.out.print("At index: ");
                    int index = input.nextInt();
                    if (index <= count && index > -1) {
                        System.out.print("Number: ");
                        int number = input.nextInt();

                        for (int i = count - 1; i >= index; i--) {
                            numbers[i + 1] = numbers[i];
                        }

                        numbers[index] = number;
                        count = count + 1;
                    } else {
                        System.out.printf("Only add at index [0, %d]\n", count);
                    }
                } else {
                    System.out.println("Array is full.");
                }
            } else if (option == 3) {
                System.out.print("Index: ");
                int index = input.nextInt();

                if (index < count - 1 && index > -1) {

                    for (int i = index; i < count - 1; i++) {
                        numbers[i] = numbers[i + 1];
                    }
                    numbers[count - 1] = 0;
                    count = count - 1;
                } else {
                    System.out.printf("Only delete at index [0, %d)\n", count);
                }
            } else if (option >= 4) {
                System.out.println("Exiting.");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
        input.close();
    }
}