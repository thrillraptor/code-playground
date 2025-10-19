public class problem08MergeSort {

    public void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            mergeArray(arr, l, m, r);
        }
    }

    public void mergeArray(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }

        for (int i = 0; i < n2; i++) {
            R[i] = arr[m + 1 + i];
        }

        int lTop = 0;
        int rTop = 0;

        int k = l;

        while (lTop < n1 && rTop < n2) {
            if (L[lTop] <= R[rTop]) {
                arr[k] = L[lTop];
                lTop++;
            } else {
                arr[k] = R[rTop];
                rTop++;
            }
            k++;
        }

        while (lTop < n1) {
            arr[k] = L[lTop];
            lTop++;
            k++;
        }

        while (rTop < n2) {
            arr[k] = R[rTop];
            rTop++;
            k++;
        }
    }

    public static void main(String[] Args) {

        problem08MergeSort obj = new problem08MergeSort();

        int arr[] = { 38, 27, 43, 10 };

        obj.mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t", arr[i]);
        }
        System.out.println();
    }

}