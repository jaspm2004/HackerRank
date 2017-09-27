package challenges;

import java.util.Scanner;

/**
 *
 * @author José San Pedro
 */
public class ChSumMaxMin {

    public static void main(String[] args) {
        String input1 = "1 2 3 4 5";
        String input2 = "256741038 623958417 467905213 714532089 938071625";
        String input3 = "156873294 719583602 581240736 605827319 895647130";
        Scanner in = new Scanner(input3);
        int[] arr = new int[5];
        for (int arr_i = 0; arr_i < 5; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        
        long max = 0;
        long min = Long.MAX_VALUE;
        long tmp;
        for (int i = 0; i < arr.length; i++) {
            tmp = 0;
            for (int j = 0; j < arr.length; j++) {
                if (j != i)
                    tmp += arr[j];
            }
            
            if (tmp > max)
                max = tmp;
            
            if (tmp < min)
                min = tmp;
        }
        
        System.out.println(min + " " + max);
    }
}
