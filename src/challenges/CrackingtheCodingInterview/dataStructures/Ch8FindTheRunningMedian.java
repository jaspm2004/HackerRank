package challenges.CrackingtheCodingInterview.dataStructures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author José San Pedro
 */
public class Ch8FindTheRunningMedian {

    public static void main(String[] args) {
        String input = "6\n"
                + "12\n"
                + "4\n"
                + "5\n"
                + "3\n"
                + "8\n"
                + "7";
        
        Scanner in = new Scanner(input);
        int n = in.nextInt();
        int[] a = new int[n];
        Heap heap = new Heap();
        for (int a_i = 0; a_i < n; a_i++) {
            //a[a_i] = in.nextInt();
            heap.add(in.nextInt());
            System.out.println(heap.median());
        }
    }
    
    public static void findMedian(int[] arr, int index) {
        float m;
        int size = index + 1;
        int[] nA = new int[size];
        int sIndex = index / 2;
        
        // cria novo array com itens != 0
        for (int i = 0; i < size; i++)
            nA[i] = arr[i];
        
        // ordena array em orde crescente
        Arrays.sort(nA);
        
        // calcula a média
        if (size % 2 == 0) {    
            // se o número de elementos do array é par
            m = (float) (nA[sIndex] + nA[sIndex + 1]) / 2;
        } else {
            // se o número de elementos do array é ímpar
            m = nA[sIndex];
        }

        System.out.println(m);
    }
}

class Heap {
    Queue<Integer> low = new PriorityQueue<>(Comparator.reverseOrder());
    Queue<Integer> high = new PriorityQueue<>();

    public void add(int element) {
        Queue target;
        if (low.size() <= high.size())
            target = low;
        else
            target = high;

        target.add(element);
        balance();
    }
    
    private void balance() {
        if(!low.isEmpty() && !high.isEmpty() && low.peek() > high.peek()) {
            Integer lowHead = low.poll();
            Integer highHead = high.poll();
            low.add(highHead);
            high.add(lowHead);
        }
    }

    public double median() {
        double m;

        if (low.isEmpty() && high.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        } else {
            if (low.size() == high.size())
                m = (low.peek() + high.peek()) / 2.0;
            else
                m = low.peek();

            return m;
        }
    }
}
