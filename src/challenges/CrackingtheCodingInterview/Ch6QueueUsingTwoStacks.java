package challenges.CrackingtheCodingInterview;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author José San Pedro
 */
public class Ch6QueueUsingTwoStacks {
    
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<>();
        Stack<T> stackOldestOnTop = new Stack<>();

        public void enqueue(T value) { // Push onto newest stack
            stackNewestOnTop.push(value);
        }

        public T peek() {
             return stackNewestOnTop.firstElement();
        }

        public T dequeue() {
            T element = stackNewestOnTop.firstElement();
            stackNewestOnTop.remove(element);
            return element;
        }
    }
    
    public static class MyQueue1<T> {
        Stack<T> stackNewestOnTop = new Stack<>();
        Stack<T> stackOldestOnTop = new Stack<>();

        public void enqueue(T value) { // Push onto newest stack
            stackNewestOnTop.push(value);
        }

        public T peek() {
            syncStacks();
            T element = stackOldestOnTop.pop();
            stackOldestOnTop.push(element);
            return element;
        }

        public T dequeue() {
            syncStacks();
            return stackOldestOnTop.pop();
        }
        
        private void syncStacks() {
            if (stackOldestOnTop.isEmpty())
                while (stackNewestOnTop.size() > 0) {
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
        }
    }

    
    public static void main(String[] args) {
        MyQueue1<Integer> queue = new MyQueue1<>();
        String input = "10\n" +
                        "1 42\n" +
                        "2\n" +
                        "1 14\n" +
                        "3\n" +
                        "1 28\n" +
                        "3\n" +
                        "1 60\n" +
                        "1 78\n" +
                        "2\n" +
                        "2";
        Scanner scan = new Scanner(input);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            switch (operation) {
                case 1:
                    // enqueue
                    queue.enqueue(scan.nextInt());
                    break;
                case 2:
                    // dequeue
                    queue.dequeue();
                    break;
                case 3:
                    // print/peek
                    System.out.println(queue.peek());
                    break;
                default:
                    break;
            }
        }
        scan.close();
    }
}
