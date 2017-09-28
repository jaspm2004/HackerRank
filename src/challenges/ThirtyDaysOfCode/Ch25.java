package challenges.ThirtyDaysOfCode;

import java.util.Scanner;

/**
 *
 * @author José San Pedro
 */
public class Ch25 {
    public static void main(String[] args) {
        String input1 = "3\n" +
                        "12\n" +
                        "5\n" +
                        "7";
        String input2 = "1\n"
                        + "2";
        Scanner scan = new Scanner(input2);
        int t = scan.nextInt();
        int n;
        
        for (int i = 0; i < t; i++) {
            n = scan.nextInt();
            if (isPrime(n))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }
    
    //checks whether an int is prime or not.
    public static boolean isPrime(int n) {
        if (n == 1)
            return false;
        
        //check if n is a multiple of 2
        if (n != 2 && n % 2 == 0) {
            return false;
        }
        //if not, then just check the odds
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
