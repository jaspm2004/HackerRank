package challenges;

import java.util.Scanner;

/**
 *
 * @author José San Pedro
 */
public class ChArrayRotation {

    public static void main(String[] args) {
        String input = "3 2 3\n1 2 3\n0\n1\n2";
        Scanner in = new Scanner(input);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        int nextInt;        
        int rot = k % n;
         
        for(int a_i = 0; a_i < n; a_i++){
            nextInt = in.nextInt();
            a[a_i] = nextInt;            
        }            
               
        /*for (int i = 0; i < k; i++) {
            a = rotate(a);
        }*/
        
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();  
            int mRot;
            if (m - rot >= 0)
                mRot = m - rot;
            else
                mRot = m - rot + a.length;
            
            System.out.println(a[mRot]);
        }
    }

    public static int[] rotate(int[] a) {
        int size = a.length;
        int[] tmp = new int[size];

        for (int i = 0; i < size; i++) {
            if (i == 0) {
                tmp[i] = a[size - 1];
            } else {
                tmp[i] = a[i - 1];
            }
        }

        return tmp;
    }
}
