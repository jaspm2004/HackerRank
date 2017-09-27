package challenges.ThirtyDaysOfCode;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author José San Pedro
 */
public class Ch23 {

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        String input = "6\n" +
                        "3\n" +
                        "5\n" +
                        "4\n" +
                        "7\n" +
                        "2\n" +
                        "1";
        Scanner sc = new Scanner(input);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        
        levelOrder(root);
    }
    
    static void levelOrder(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        
        if (root != null) {
            // enqueue current root
            queue.add(root);
        
            // while there are nodes to process
            while(queue.size() > 0) {
                // dequeue next node
                Node leaf = queue.remove();

                // process tree's root;
                System.out.print(leaf.data + " ");
                // enqueue child elements from next level in order
                if(leaf.left != null) {
                    queue.add(leaf.left);
                }
                
                if(leaf.right != null) {
                    queue.add(leaf.right);
                }
            }
        } 
    }
}