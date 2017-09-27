package challenges;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author informix
 */
public class ChDateTime {
    
    public static void main(String[] args) {
        String input = "08 05 2015";
        Scanner scan = new Scanner(input);
        String month = scan.next();
        String day = scan.next();
        String year = scan.next();
        
        int yearInt = Integer.parseInt(year);
        
        if (2000 <= yearInt && yearInt <= 3000)
            System.out.println(getDay(day, month, year));
    }
    
    public static String getDay(String day, String month, String year) {
        int yearInt = Integer.parseInt(year);
        int monthInt = Integer.parseInt(month) - 1;
        int dayInt = Integer.parseInt(day);
        Calendar cal = new GregorianCalendar(yearInt, monthInt, dayInt);

        String dayStr = "";        
        switch(cal.get(Calendar.DAY_OF_WEEK)) {
            case 1 :
                dayStr = "SUNDAY";
                break;
            case 2 :
                dayStr = "MONDAY";
                break;
            case 3 :
                dayStr = "TUESDAY";
                break;
            case 4 :
                dayStr = "WEDNESDAY";
                break;
            case 5 :
                dayStr = "THURSDAY";
                break;
            case 6 :
                dayStr = "FRIDAY";
                break;
            case 7 :
                dayStr = "SATURDAY";
                break;
        }

        return dayStr;
    }
}
