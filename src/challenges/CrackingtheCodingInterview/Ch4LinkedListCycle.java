package challenges.CrackingtheCodingInterview;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author José San Pedro
 */
public class Ch4LinkedListCycle {
    
    public static void main(String[] args) {
        Node node1 = new Node();
        node1.data = 1;
        
        Node node2 = new Node();
        node2.data = 2;
        node1.next = node2;
        
        Node node3 = new Node();
        node3.data = 3;
        node2.next = node3;
        
        Node node4 = new Node();
        node4.data = 4;
        node3.next = node4;        
        
        node4.next = node2;
        
        if (hasCycle(node1))
            System.out.println("1");
        else
            System.out.println("0");
    }        
    
    static boolean hasCycle(Node head) {
        Node fast = head;
    
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            head = head.next;

            if(head.equals(fast)) {
                return true;
            }
        }
        
        return false;
    }
}

class Node {
    int data;
    Node next;
}
