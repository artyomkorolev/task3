package ru.vsu.cs.cource1;

import java.util.Queue;

public class Task {
    public static int sizeQueue(Queue<Integer> queue){
        int size = 0;
        queue.add(null);
        Integer v = queue.remove();
        while (v != null){
            queue.add(v);
            v = queue.remove();
            size++;
        }
        return size;
    }

    public static Integer maxInQueue(Queue<Integer> queue){
        queue.add(null);
        Integer curr = queue.remove();
        Integer max = curr;
        while (curr != null) {
            if ( curr > max) max = curr;
            queue.add(curr);
            curr = queue.remove();
        }
        return max;
    }

    public static Integer minInQueue(Queue<Integer> queue){
        queue.add(null);
        Integer curr = queue.remove();
        Integer min = curr;
        while (curr != null) {
            if ( curr < min) min = curr;
            queue.add(curr);
            curr = queue.remove();
        }
        return min;
    }

}
