package Matrix;

import java.util.Scanner;

public class UtilMatrix {
    private Problem07Matrix m;
    private Scanner iScanner = new Scanner(System.in);

    public void entryPoint() {
        while (true) {

            System.out.println("---Matrix Menu---");
            System.out.println("1. Initialize Matrix");
            System.out.println("2. Display");
            System.out.println("3. Left Diagonal");
            System.out.println("4. Right Diagonal");
            System.out.println("5. Max Index");
            System.out.println("6. Min Index");
            System.out.print("Option Here # ");
            int option = iScanner.nextInt();

            if (option == 1) {
                System.out.print("Number of rows # ");
                int rows = iScanner.nextInt();
                System.out.print("Number of columns # ");
                int cols = iScanner.nextInt();

                m = new Problem07Matrix(rows, cols);
                m.setMatrx();
            } else if (option == 2) {
                m.displayMatrx();
            } else if (option == 3) {
                int[] arr = m.diagonalTLBR();
                for (int i = 0; i < arr.length; i++) {
                    System.out.printf("%d\t", arr[i]);
                }
                System.out.println();
            } else if (option == 4) {
                int[] arr = m.diagonalTRBL();
                for (int i = 0; i < arr.length; i++) {
                    System.out.printf("%d\t", arr[i]);
                }
                System.out.println();
            } else if (option == 5) {
                int[] max = m.getMax();
                System.out.printf("Row %d : Col %d", max[0], max[1]);
                System.out.println();
            } else if (option == 6) {
                int[] min = m.getMin();
                System.out.printf("Row %d : Col %d", min[0], min[1]);
                System.out.println();
            } else if (option == 7) {
                break;
            }

        }
    }

    public static void main(String[] Args) {
        UtilMatrix um = new UtilMatrix();
        um.entryPoint();
    }
}
