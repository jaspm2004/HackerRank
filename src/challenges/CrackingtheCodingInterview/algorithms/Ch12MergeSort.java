
package challenges.CrackingtheCodingInterview.algorithms;

import java.util.Scanner;

/**
 *
 * @author José San Pedro
 */
public class Ch12MergeSort {
    static long countInversions(int[] arr) {
        
        return 0;
    }

    public static void main(String[] args) {
        String input = "2  \n" +
                        "5  \n" +
                        "1 1 1 2 2  \n" +
                        "5  \n" +
                        "2 1 3 1 2";
        
        Scanner in = new Scanner(input);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int arr_i = 0; arr_i < n; arr_i++) {
                arr[arr_i] = in.nextInt();
            }
            
            long result = countInversions(arr);
            System.out.println(result);
        }
        in.close();
    }
    
    public static void mergesort(int[] array) {
        mergesort(array, 0, array.length - 1);
    }
    
    public static void mergesort(int[] array, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd)
            return;
        
        int middle = (rightEnd - leftStart) / 2;
        mergesort(array, leftStart, middle);
        mergesort(array, middle + 1, rightEnd);
        merge(array, leftStart, rightEnd);
    }
    
    public static void merge(int[] array, int leftStart, int rightEnd) {
        
    }
}
