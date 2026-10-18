import java.util.Scanner;
import java.util.Arrays;

public class MergeSortDemo {

    public static void main(String[] args) {

        int dataSize = 100;
        int[] arr = new int[dataSize];

        for (int i = 0; i < dataSize; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }

        System.out.println("--- Merge Sort ---");
        System.out.println("Original Unsorted Array (100 elements):");
        System.out.println(Arrays.toString(arr));

        long startTime = System.nanoTime();

        // Merge Sort Call
        mergeSort(arr, 0, arr.length - 1);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;

        System.out.println("\nSorted Array (100 elements):");
        System.out.println(Arrays.toString(arr));

        System.out.println(
            "\nExecution time in NanoSeconds: "
            + totalTime + " ns\n"
        );
    }

    public static void mergeSort(int[] arr, int l, int r) {

        if (l < r) {

            int m = l + (r - l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = arr[m + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while (i < n1 && j < n2) {

            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}