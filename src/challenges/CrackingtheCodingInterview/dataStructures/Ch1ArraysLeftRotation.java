package challenges.CrackingtheCodingInterview.dataStructures;

import java.util.Scanner;

/**
 *
 * @author José San Pedro
 */
public class Ch1ArraysLeftRotation {
    
    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int rot = k % n;
        int[] output = new int[n];
        
        for(int a0 = 0; a0 < n; a0++){
            int mRot;
            if (a0 - rot >= 0)
                mRot = a0 - rot;
            else
                mRot = a0 - rot + a.length;
        
            output[mRot] = a[a0];
        }
        
        return output;
    }

    public static void main(String[] args) {
        String input = "5 4\n" +
                        "1 2 3 4 5";
        Scanner in = new Scanner(input);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int[] output;
        output = arrayLeftRotation(a, n, k);
        for (int i = 0; i < n; i++) {
            System.out.print(output[i] + " ");
        }

        System.out.println();

    }
}
