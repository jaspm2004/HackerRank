package challenges.CrackingtheCodingInterview.dataStructures;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author José San Pedro
 */
public class Ch7IsBinarySearchTree {
    static List<Integer> leafs = new ArrayList<>();
    
    static boolean checkBST(NodeTree root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    static boolean checkBST(NodeTree node, int min, int max) {
        boolean left, right, nLeft, nRight;
        if (node == null) 
            return true;
        
        left = node.data < max;
        right = min < node.data;
        
        nLeft = checkBST(node.left, min, node.data);
        nRight = checkBST(node.right, node.data, max);
        
        return left && right && nLeft && nRight;
    }
    
    static boolean checkBST() {
        int last = 0;
        for (int next : leafs) {
            if (next < last)
                return false;
            last = next;
        }
        
        return true;
    }

    static void traversal(NodeTree root) {
        if (root.left != null)
            traversal(root.left);
        
        leafs.add(root.data);
        
        if (root.right != null)
            traversal(root.right);
        
        
    }
    
    public static void main(String[] args) {
        NodeTree node1 = new NodeTree();
        node1.data = 1;
        
        NodeTree node3 = new NodeTree();
        node3.data = 3;
        
        NodeTree node2 = new NodeTree();
        node2.data = 2;
        node2.left = node3;
        node2.right = node1;
        
        NodeTree node7 = new NodeTree();
        node7.data = 7;
        
        NodeTree node4 = new NodeTree();
        node4.data = 4;
        
        NodeTree node5 = new NodeTree();
        node5.data = 5;
        
        NodeTree node6 = new NodeTree();
        node6.data = 6;
        node6.left = node5;
        node6.right = node7;
        
        NodeTree root = node4;
        root.left = node2;
        root.right = node6;
        
        traversal(root);
        System.out.println(leafs.toString());
        
        if (checkBST(root))
            System.out.println("Yes");
        else
            System.out.println("No");
        
        if (checkBST())
            System.out.println("Yes");
        else
            System.out.println("No");
                
    }
}

class NodeTree {
    int data;
    NodeTree left;
    NodeTree right;
 }
