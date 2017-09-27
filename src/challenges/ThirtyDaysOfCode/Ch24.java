package challenges.ThirtyDaysOfCode;

import java.util.Scanner;

/**
 *
 * @author José San Pedro
 */
public class Ch24 {

    public static ListNode insert(ListNode head, int data) {
        ListNode p = new ListNode(data);
        if (head == null) {
            head = p;
        } else if (head.next == null) {
            head.next = p;
        } else {
            ListNode start = head;
            while (start.next != null) {
                start = start.next;
            }
            start.next = p;

        }
        return head;
    }

    public static void display(ListNode head) {
        ListNode start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static ListNode removeDuplicates(ListNode head) {
        if (head != null) {
            ListNode tmp, next = head;
            while (next != null) {
                tmp = next;
                
                while (tmp.next != null) {
                    if (next.data == tmp.next.data) {
                        tmp.next = tmp.next.next;
                    } else {
                        tmp = tmp.next;
                    }
                }
                //display(head); System.out.println();
                next = next.next;
            }
        }

        return head;
    }

    public static void main(String args[]) {
        String input = "6\n"
                + "1\n"
                + "2\n"
                + "2\n"
                + "3\n"
                + "3\n"
                + "4";
        Scanner sc = new Scanner(input);
        ListNode head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);
    }
}

class ListNode {

    int data;
    ListNode next;

    ListNode(int d) {
        data = d;
        next = null;
    }
}
