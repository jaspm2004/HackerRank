package challenges;

import java.util.Scanner;

/**
 *
 * @author José San Pedro
 */
public class ChKangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (x1 > x2 && v1 > v2)
            return "NO";
        
        if (x1 < x2 && v1 < v2)
            return "NO";
        
        if((v1 != v2) && ((x2-x1) % (v1-v2)) == 0)
            return "YES";
        else
            return "NO";
    }
    
    public static void main(String[] args) {
        String input1 = "0 3 4 2";
        String input2 = "0 2 5 3";
        String input3 = "14 4 98 2";
        String input4 = "42 3 94 2";
        Scanner in = new Scanner(input4);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}