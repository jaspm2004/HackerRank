package challenges.ThirtyDaysOfCode;

import java.util.*;

public class Ch26 {

    public static void main(String[] args) {
        String input = "9 6 2015\n" +
                        "6 6 2015";
        Scanner scan = new Scanner(input);        
        int dR = scan.nextInt();
        int mR = scan.nextInt();
        int yR = scan.nextInt();
        
        int dD = scan.nextInt();
        int mD = scan.nextInt();
        int yD = scan.nextInt();
        
        int fine = -1;
        
        // se dateR <= dateD, fine = 0
        if (yR <= yD)
            fine = 0;
        
        // se retorna depois da data, porém no mesmo mês fine = 15 * número de dias atrasados
        if (yR == yD)
            if (mR == mD)
                if (dR > dD) 
                    fine = (dR - dD) * 15;                    
                        
        // se retorna depois do mês, porém no mesmo ano fine = 500 * número de messes atrasados
        if (yR == yD)
            if (mR > mD)                                    
                fine = (mR - mD) * 500;   
        
        // se o livro retorna depois de um ano calendário, fine = 10000
        if (yR > yD)
            fine = 10000;
        
        System.out.println(fine);
    }
}