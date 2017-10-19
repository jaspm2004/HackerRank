package challenges.CrackingtheCodingInterview.dataStructures;

import java.util.Scanner;

/**
 *
 * @author José San Pedro
 */
public class Ch2StringsMakingAnagrams {
    public static int numberNeeded(String first, String second) {
        int[] lettercounts = new int[26];
        for(char c : first.toCharArray()){
                lettercounts[c-'a']++;
        }
        
        for(char c : second.toCharArray()){
                lettercounts[c-'a']--;
        }
        
        int result = 0;
        for(int i : lettercounts){
                result += Math.abs(i);
        }
        
        return result;
    }
  
    public static void main(String[] args) {
        String input1 = "cde\n" +
                        "abc";
        String input2 = "fcrxzwscanmligyxyvym\n" +
                        "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        Scanner in = new Scanner(input1);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}