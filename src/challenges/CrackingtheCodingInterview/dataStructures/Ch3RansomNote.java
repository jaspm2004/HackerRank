package challenges.CrackingtheCodingInterview.dataStructures;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author José San Pedro
 */
public class Ch3RansomNote {

    public static void main(String[] args) {
        String input1 = "6 4\n" +
                        "give me one grand today night\n" +
                        "give one grand today";
        String input2 = "6 5\n" +
                        "two times three is not four\n" +
                        "two times two is four";
        String input3 = "100 100\n" +
                        "wi z ne we ebixk yvrd qrd ojckw q xe e bcco xb ieqym dwuu w dnapw achkt xqdhs nstms zmqu csqxi rim tvic arq fvjqx x su ty zl zmah y tv rkjq hpvpx ujj f i u fl iv n mnrvx tho diz k tidi gr ptkq z tho su diz yvrd dwuu dnapw xb arq xb mnrvx xe bcco qrd y ptkq rim fvjqx bcco q q wi i tidi gr mnrvx hpvpx tv f y mnrvx we fvjqx tv f wi ptkq ujj rim ebixk tho ptkq rkjq yvrd dwuu zl ujj zl qrd e ieqym\n" +
                        "dwuu tvic y dnapw ujj tidi nstms x xe achkt x su zmqu iv zmqu xb ojckw we fvjqx tvic tv ne rkjq diz tvic we rkjq nstms zmah ieqym zmah fl xb wi tho x z ty u i gr ptkq q su tho rim tv iv iv yvrd xe qrd y dnapw q zmah arq we ieqym su zl q xb arq rkjq q e xb zl ty fvjqx ptkq ieqym qrd y wi wi nstms diz dnapw zmah q ebixk su e xb q i mnrvx wi x x tidi w ojckw bcco e tv rkjq tho";
        String input4 = "12 2\n" +
                        "h ghq g xxy wdnr anjst xxy wdnr h h anjst wdnr\n" +
                        "h ghq";
        
        String input5 = "15 17\n" +
                        "o l x imjaw bee khmla v o v o imjaw l khmla imjaw x\n" +
                        "imjaw l khmla x imjaw o l l o khmla v bee o o imjaw imjaw o";
        
        Scanner scanner = new Scanner(input5);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if (answer) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

class Solution {
    Map<String, Integer> magazineMap = new HashMap<>();
    Map<String, Integer> noteMap = new HashMap<>();
    
    public Solution(String magazine, String note) {
        fillMap(magazine, magazineMap);
        fillMap(note, noteMap);
    }
    
    private void fillMap(String str, Map<String, Integer> map) {
        String[] array = str.split(" ");
        int cont;
        for (int i = 0; i < array.length; i++) {
            cont = 0;
            if (map.get(array[i]) != null) {
                cont = map.get(array[i]);
            }
            
            map.put(array[i], cont + 1);
        }
    }

    public boolean solve() {
        int mapValue;
        int noteValue;
        
        for (Entry<String, Integer> entry : noteMap.entrySet()) {
            if (magazineMap.get(entry.getKey()) != null) {
                mapValue = magazineMap.get(entry.getKey());
                noteValue = entry.getValue();
                if (mapValue < noteValue)
                    return false;
            }
        }
        
        return true;
    }
}
