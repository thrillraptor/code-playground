import java.util.Scanner;

public class problem06BinarySearch {
    public static void main(String[] Args) {
        int[] array = { 1, 6, 7, 9, 22, 25, 45, 67, 77, 89, 99 };

        Scanner input = new Scanner(System.in);

        System.out.print("Find Number # ");
        int number = input.nextInt();

        int result = BinarySearch(array, 0, array.length - 1, number);
        System.out.printf("Number # %d at index %d.", number, result);

        input.close();
    }

    public static int BinarySearch(int[] array, int a, int b, int key) {
        if (a <= b) {

            int mid = (a + b) / 2;

            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] > key) {
                return BinarySearch(array, a, mid - 1, key);
            }
            return BinarySearch(array, mid + 1, b, key);

        }
        return -1;
    }
}
