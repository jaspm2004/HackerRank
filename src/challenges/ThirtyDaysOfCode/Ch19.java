package challenges.ThirtyDaysOfCode;

/**
 *
 * @author informix
 */
public class Ch19 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1000;
        
        if (1 <= n && n <= 100) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
        }
        
        System.out.println(sum);        
    }
}
