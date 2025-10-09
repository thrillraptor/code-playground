package Matrix;

import java.util.Scanner;

public class Problem07Matrix {
    private int[][] matrx;
    private int rows;
    private int cols;
    private Scanner iScanner = new Scanner(System.in);

    public Problem07Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrx = new int[rows][cols];
    }

    public void setMatrx() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Element [%d][%d]\t", i, j);
                matrx[i][j] = iScanner.nextInt();
            }
        }
    }

    public void displayMatrx() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%d\t", matrx[i][j]);
            }
            System.out.println();
        }
    }

    public int[] diagonalTLBR() {
        int[] d = new int[this.rows];
        for (int i = 0; i < this.rows; i++) {
            d[i] = this.matrx[i][i];
        }
        return d;
    }

    public int[] diagonalTRBL() {
        int[] d = new int[this.rows];
        for (int i = 0; i < this.rows; i++) {
            d[i] = this.matrx[i][this.cols - i - 1];
        }
        return d;
    }

    public int[] getMax() {
        int[] maxIndices = { -1, -1 };
        int max = 0;

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                if (matrx[i][j] >= max || maxIndices[0] == -1) {
                    max = matrx[i][j];
                    maxIndices[0] = i;
                    maxIndices[1] = j;
                }
            }
        }
        return maxIndices;
    }

    public int[] getMin() {
        int[] minIndices = { -1, -1 };
        int min = 0;

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                if (matrx[i][j] <= min || minIndices[0] == -1) {
                    min = matrx[i][j];
                    minIndices[0] = i;
                    minIndices[1] = j;
                }
            }
        }
        return minIndices;
    }
}
