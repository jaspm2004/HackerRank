package challenges.CrackingtheCodingInterview.algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author José San Pedro
 */
public class Ch11QuickSort {

    public static void main(String[] args) {
        String input = "5\n" +
                        "amy 100\n" +
                        "david 100\n" +
                        "heraldo 50\n" +
                        "aakansha 75\n" +
                        "aleksa 150";
        
        Scanner scan = new Scanner(input);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

/**
 * the players are first sorted by decreasing score and then sorted alphabetically by name. 
 */
class Checker implements Comparator<Player> {

        @Override
        public int compare(Player p1, Player p2) {
            int p1Score = p1.score;
            int p2Score = p2.score;

            // a positive - greater than the second
            if (p1Score > p2Score) {
                return 1;
            }

            // negative integer - is less than
            if (p1Score < p2Score) {
                return -1;
            }

            // zero - equal to
            if (p1Score == p2Score) {
                return p1.name.compareTo(p2.name);
            }

            return 0;
        }
    }

    class Player {

        String name;
        int score;

        Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }
