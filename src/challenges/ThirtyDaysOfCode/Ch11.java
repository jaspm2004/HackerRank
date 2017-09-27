package challenges.ThirtyDaysOfCode;

/**
 *
 * @author informix
 */
public class Ch11 {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        int arr[][] = {
                        {-1, -1, 0, -9, -2, -2},
                        {-2, -1, -6, -8, -2, -5},
                        {-1, -1, -1, -2, -3, -4},
                        {-1, -9, -2, -4, -4, -5},
                        {-7, -3, -3, -2, -9, -9},
                        {-1, -3, -1, -2, -4, -5}
                    };
        
        int max = -100;
        int sum;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                sum = getHSum(i, j, arr);   
                if (sum != 100)
                    if (sum > max)
                        max = sum;
            }
        }
        
        System.out.println(max);
    }
    
    public static int getHSum(int i, int j, int[][] arr) {
        int sum = 0;
        int value;
        int iOk = i + 1;
        int jOk = j + 1;
        int iMax = i + 3;
        int jMax = j + 3;
                
        if (iMax <= 6 && jMax <= 6) {
            for (int h = i; h < iMax; h++) {
                for (int k = j; k < jMax; k++) {
                    value = arr[h][k];
                    if (h == iOk) {
                        if (k != jOk)
                            value = 0;
                    }

                    sum += value;
                }
            }
        } else
            return 100;
        
        return sum;
    }
}
