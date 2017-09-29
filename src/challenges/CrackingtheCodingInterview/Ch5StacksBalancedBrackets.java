package challenges.CrackingtheCodingInterview;

import java.util.Scanner;

/**
 *
 * @author José San Pedro
 */
public class Ch5StacksBalancedBrackets {
    
    public static boolean isBalanced(String expression) {
        int size = expression.length();
        
        if (size > 2)
            return isBalanced(expression.substring(1, size - 1));
        else {
            char lb = expression.charAt(0);
            char rb = expression.charAt(size - 1);
            char rbOK = ' ';
            switch (lb) {
                case '{' :
                    rbOK = '}';
                    break;
                case '[' :
                    rbOK = ']';
                    break;
                case '(' :
                    rbOK = ')';
                    break;
            }
            
            if (rb == rbOK)
                return true;
        }
        
        return false;
    }
  
    public static void main(String[] args) {
        String input1 = "3\n" +
                        "{[()]}\n" +
                        "{[(])}\n" +
                        "{{[[(())]]}}";
        String input2 = "";
        
        Scanner in = new Scanner(input1);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }
}