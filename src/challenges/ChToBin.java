package challenges;

/**
 *
 * @author informix
 */
public class ChToBin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(toBinary(6));
        String input = "a";
        String[] array = input.split(" ");
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            if (!array[i].isEmpty())
                System.out.println(array[i]);
        }
    }
    
    public static int toBinary(int n) {
        int rest;
        int cont = 0;
        int max = 0;
        
        while (n > 0) {
            rest = n % 2;
            if (rest == 1) {
                cont++;
            } else {
                if (cont > max) {
                    max = cont;                    
                }
                cont = 0;
            }
            
            n = n / 2;
        }
        
        if (cont > max)
            max = cont;
        
        return max;
    }
}
