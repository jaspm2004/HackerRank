package challenges.ThirtyDaysOfCode;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author José San Pedro
 */
public class Ch28 {

    public static void main(String[] args) {
        String input = "6\n" +
                        "riya riya@gmail.com\n" +
                        "julia julia@julia.me\n" +
                        "julia sjulia@gmail.com\n" +
                        "julia julia@gmail.com\n" +
                        "samantha samantha@gmail.com\n" +
                        "tanya tanya@gmail.com";
        Scanner in = new Scanner(input);
        int N = in.nextInt();
        List<String> list = new ArrayList<>();
        
        
        
        for (int a0 = 0; a0 < N; a0++) {
            String firstName = in.next();
            String emailID = in.next();
            
            if (isMatch1(firstName, emailID))
                list.add(firstName);
        }
        
        Collections.sort(list);
        for (String name : list) {
            System.out.println(name);
        }
    }
    
    private static boolean isMatch1(String name, String email) {
        String emailRegEx = "[a-z]+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegEx);
        Matcher matcher = pattern.matcher(email);
        
        return matcher.find();
    }
    
    private static boolean isMatch2(String name, String email) {
        String[] emailArr = email.split("@");
        return emailArr[1].equals("gmail.com");
    }
}
