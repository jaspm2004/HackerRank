package challenges.ThirtyDaysOfCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author informix
 */
public class Ch18 {

    Stack<Character> stack;
    List<Character> list;

    Ch18() {
        stack = new Stack<>();
        list = new ArrayList<>();
    }

    void pushCharacter(char ch) {
        stack.push(ch);
    }

    void enqueueCharacter(char ch) {
        list.add(ch);
    }

    char popCharacter() {
        return stack.pop();
    }

    char dequeueCharacter() {
        return list.remove(0);
    }

    public static void main(String[] args) {
        String inputScan = "yes";
        Scanner scan = new Scanner(inputScan);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Ch18 p = new Ch18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        char c1, c2;
        for (int i = 0; i < s.length / 2; i++) {
            c1 = p.popCharacter();
            c2 = p.dequeueCharacter();
            if (c1 != c2) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}
