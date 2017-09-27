package challenges;

import java.util.Scanner;

/**
 *
 * @author informix
 */
public class ChStrInt {
    public static void main(String[] args) {
        String strIn = "hello\nJava";
        Scanner sc = new Scanner(strIn);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        
        if (A.charAt(0) > B.charAt(0))
            System.out.println("Yes");
        else
            System.out.println("No");
        
        A = A.substring(0, 1).toUpperCase()+ A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        
        System.out.println(A + " " + B);      
    }
}
