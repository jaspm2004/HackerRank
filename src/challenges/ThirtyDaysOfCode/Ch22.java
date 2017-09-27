package challenges.ThirtyDaysOfCode;

import java.util.Scanner;

/**
 * The height of a binary search tree is the number of edges between the tree's root and its furthest leaf. 
 * You are given a pointer, root, pointing to the root of a binary search tree. 
 * Complete the getHeight function provided in your editor so that it returns the height of the binary search tree.
 * 
 * @author José San Pedro
 */
public class Ch22 {

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

    public static int getHeight(Node root) {
        int hL = -1, hR = -1;

        if (root.left != null) {
            hL = getHeight(root.left);
        }

        if (root.right != null) {
            hR = getHeight(root.right);
        }

        return 1 + Math.max(hL, hR);
    }

    public static void main(String args[]) {
        String input = "7\n" +
                        "3\n" +
                        "5\n" +
                        "2\n" +
                        "1\n" +
                        "4\n" +
                        "6\n" +
                        "7";
        Scanner sc = new Scanner(input);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}

class Node {

    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
