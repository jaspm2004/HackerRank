package challenges.CrackingtheCodingInterview.dataStructures;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author José San Pedro
 */
public class Ch4LinkedListCycle {
    
    public static void main(String[] args) {
        NodeList node1 = new NodeList();
        node1.data = 1;
        
        NodeList node2 = new NodeList();
        node2.data = 2;
        node1.next = node2;
        
        NodeList node3 = new NodeList();
        node3.data = 3;
        node2.next = node3;
        
        NodeList node4 = new NodeList();
        node4.data = 4;
        node3.next = node4;        
        
        node4.next = node2;
        
        if (hasCycle(node1))
            System.out.println("1");
        else
            System.out.println("0");
    }        
    
    static boolean hasCycle(NodeList head) {
        NodeList fast = head;
    
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

class NodeList {
    int data;
    NodeList next;
}
