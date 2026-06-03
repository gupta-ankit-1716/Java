package lecture.codes.CollectionsAndGenerics.Collections;

import jdk.jshell.execution.Util;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        Utility.print(queue);

        System.out.println(queue.peek());
        System.out.println(queue.element());

        System.out.println(queue.remove());
        Utility.print(queue);
        System.out.println(queue.poll());
        Utility.print(queue);

        System.out.println(queue.poll());
    }
}
