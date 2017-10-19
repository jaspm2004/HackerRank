package challenges.CrackingtheCodingInterview.dataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author José San Pedro
 */
public class Ch9Contacts {

    public static void main(String[] args) {
        String input = "11\n" +
"add s\n" +
"add ss\n" +
"add sss\n" +
"add ssss\n" +
"add sssss\n" +
"find s\n" +
"find ss\n" +
"find sss\n" +
"find ssss\n" +
"find sssss\n" +
"find ssssss";
//        5
//4
//3
//2
//1
//0
        Scanner in = new Scanner(input);
        int n = in.nextInt();
        NodeTrie contacts = new NodeTrie();
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

class NodeTrie {
    private HashMap<Character, NodeTrie> children = new HashMap<>();
    private boolean isWord = false;
    private int size = 0;
    
    public void add(String s) {
        add(s, 0);
    }
    
    public void add(String s, int index) {
        size++;
        if (s.length() == index)
            return;
        
        char current = s.charAt(index);
        NodeTrie child = getNode(current);
        if (child == null) {
            child = new NodeTrie();
            if (index == s.length() - 1)
                child.isWord = true;
            setNode(current, child);
        }
        
        child.add(s, index + 1);
    }
    
    public int find(String s) {
        return findCount(s, 0);
    }
    
    private int findCount(String s, int index) {
        if (s.length() == index)
            return size;
        
        NodeTrie child = getNode(s.charAt(index));
        if (child == null) 
            return 0;
        
        return child.findCount(s, index + 1);
    }
    
    private NodeTrie getNode(char c) {
        return children.get(c);
    }
    
    private void setNode(char c, NodeTrie node) {
        children.put(c, node);
    }
}

class ContactsT {
    NodeTrie contacts;
    
    public void add(String name) {
        contacts.add(name);
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
