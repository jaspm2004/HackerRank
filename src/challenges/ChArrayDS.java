package challenges;

import java.util.Scanner;

/**
 *
 * @author José San Pedro
 */
public class ChArrayDS {

    public static void main(String[] args) {
        String input = "4\n"
                + "1 4 3 2";
        Scanner in = new Scanner(input);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }
}
