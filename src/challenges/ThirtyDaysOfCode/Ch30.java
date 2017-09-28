package challenges.ThirtyDaysOfCode;

import java.util.Scanner;

/**
 *
 * @author José San Pedro
 */
public class Ch30 {

    public static void main(String[] args) {
        String input1 = "3\n" +
                        "5 2\n" +
                        "8 5\n" +
                        "2 2";
        String input2 = "2\n" +
                        "9 2\n" +
                        "8 3";
        Scanner in = new Scanner(input2);
        int t = in.nextInt();
        int[] s;
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int k = in.nextInt();
            
            s = new int[n];
            for (int i = 1; i <= n; i++) {
                s[i - 1] = i;
            }
            
            int a, b;
            int max = 0;
            int temp;
            for (int j = 0; j < n - 1; j++) {
                for (int h = j + 1; h < n; h++) {
                    a = s[j];
                    b = s[h];
                    if (a < b) {
                        temp = a & b;
                        if (temp < k && temp > max)
                            max = temp;
                    }
                }
            }
            
            System.out.println(max);
        }            
    }
}