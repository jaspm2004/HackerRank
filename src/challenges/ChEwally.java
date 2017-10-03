package challenges;

import java.util.Scanner;

/**
 *
 * @author José San Pedro
 */
public class ChEwally {
    public static void main(String[] args) {
        String input = "6 2\n" +
                        "0 1 0 0 0 1";
        Scanner in = new Scanner(input);
        int n = in.nextInt();
        int k = in.nextInt();
        
        int[] cities = new int[n];
        for (int i = 0; i < n; i++) {
            cities[i] = in.nextInt();                    
        }
    }
}
