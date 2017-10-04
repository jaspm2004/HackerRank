package challenges;

import java.util.Scanner;

/**
 *
 * @author José San Pedro
 */
public class ChEwally {
    public static void main(String[] args) {
        String input = "6 2\n" +
                        "0 1 0 0 1 0";
        Scanner in = new Scanner(input);
        int n = in.nextInt();
        int k = in.nextInt();
        
        int[] citiesWithTowers = new int[n];
        for (int i = 0; i < n; i++) {
            citiesWithTowers[i] = in.nextInt();
        }
        
        int i = 0;
        int fartherPossibleTower = k - 1;
        int minimunNumberOfTowers = 0;
        while (true) {
            int nextTower = -1;
            // search for a tower between the last and the farther possible
            while (i <= fartherPossibleTower && i < n) {
                if (citiesWithTowers[i] == 1) {
                    nextTower = i;
                }
                i++;
            }
            
            // if no tower found, then its over
            if (nextTower == -1) {
                System.out.println(-1);
                return;
            }
            
            // if tower found, increase the result var
            minimunNumberOfTowers++;
            // move the pointer to the next tower
            i = nextTower + 1;
            // determine the next farther tower
            fartherPossibleTower = nextTower + 2 * k - 1;
            // if next tower plus range is larger or equal to number of cities
            // then all cities are covered by electricity
            if (nextTower + k >= n)
                break;
        }
        
        System.out.println(minimunNumberOfTowers);
    }
}
