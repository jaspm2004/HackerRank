package challenges.CrackingtheCodingInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author José San Pedro
 */
public class Ch5StacksBalancedBrackets {
    
    public static boolean isBalanced1(String expression) {
        int size = expression.length();
        
        if (size > 2)
            return isBalanced1(expression.substring(1, size - 1));
        else {
            char lb = expression.charAt(0);
            char rb = expression.charAt(size - 1);
            return compareBrackets(lb, rb);
        }
    }
    
    public static boolean compareBrackets(char lb, char rb) {
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

        return rb == rbOK;
    }
    
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        int size = expression.length();
        char lb, rb;
        boolean isLB;
        
        for (int i = 0; i < size; i++) {
            isLB = false;
            lb = expression.charAt(i);
            switch (lb) {
                case '{' :
                case '[' :
                case '(' : {
                    isLB = true;
                    stack.push(lb);
                }
            }
            
            if (!isLB) {
                rb = lb;
                if (stack.isEmpty())
                    return false;
                
                lb = stack.pop();
                if (!compareBrackets(lb, rb))
                    return false;
            }
        }
        if (stack.isEmpty())
            return true;
        
        return false;
    }
  
    public static void main(String[] args) {
        String input1 = "3\n" +
                        "{[()]}\n" +
                        "{[(])}\n" +
                        "{{[[(())]]}}";
        String input2 = "5\n" +
                        "[]][{]{(({{)[})(}[[))}{}){[{]}{})()[{}]{{]]]){{}){({(}](({[{[{)]{)}}}({[)}}([{{]]({{\n" +
                        "[]()([{}])[]{}[]\n" +
                        ")}{){(]{)([)}{)]())[(})[]]))({[[[)}[((]](])][({[]())\n" +
                        "{}()[[((()(({{[]}{}{{[]}}{}}))))]]{{{{([{{{{}}}}])}}}}\n" + 
                        "{{[()()]}()}(())()()[[[]]][{[]()}(())]";
        String input3 = "1\n" +
                        "{{}(";
        Scanner in = new Scanner(input3);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }
}