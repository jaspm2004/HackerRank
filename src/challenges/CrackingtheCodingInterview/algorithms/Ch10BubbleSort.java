package challenges.CrackingtheCodingInterview.algorithms;

import java.util.Scanner;

/**
 *
 * @author José San Pedro
 */
public class Ch10BubbleSort {

    public static void main(String[] args) {
        String input = "3\n"
                + "3 2 1";

        Scanner scan = new Scanner(input);
        int n = scan.nextInt();
        int elem;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            elem = scan.nextInt();
            array[i] = elem;
        }

        bubbleSort(array, n);
    }

    public static void bubbleSort(int[] a, int n) {
        int allSwaps = 0;

        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    numberOfSwaps++;
                }
            }

            allSwaps += numberOfSwaps;

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }

        System.out.println("Array is sorted in " + allSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
