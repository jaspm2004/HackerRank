package challenges.CrackingtheCodingInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author José San Pedro
 */
public class Ch9Contacts {

    public static void main(String[] args) {
        String input = "4\n" +
                        "add hack\n" +
                        "add hackerrank\n" +
                        "find hac\n" +
                        "find hak";
        Scanner in = new Scanner(input);
        int n = in.nextInt();
        Contacts contacts = new Contacts();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            
            if (op.equals("add"))
                contacts.add(contact);
            
            if (op.equals("find"))
                System.out.println(contacts.find(contact));
        }
    }
}

class Contacts {
    List<String> contacts = new ArrayList<>();
    
    public void add(String name) {
        contacts.add(name);
    }
    
    public int find(String partial) {
        int total = 0;
        
        for (String name : contacts) {
            if (name.startsWith(partial))
                total++;
        }
        
        return total;
    }
}
