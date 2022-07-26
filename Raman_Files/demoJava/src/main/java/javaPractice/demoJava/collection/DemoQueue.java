package javaPractice.demoJava.collection;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoQueue {
    public DemoQueue(){
        Queue<Integer> queue= new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            queue.offer(i); //return true/false if task is successfull or not
            i++;
            queue.add(i);// return true if task is successfull else throws an exception so app can crashed
        }
        System.out.println(queue);
        //we can use queue.add(i) also to add element but it will throws an exception
        // if task is not successfully done, else true
        System.out.print(queue.peek());//return null if queue is empty
        System.out.print(queue.element());// but it will throws an exception
        // if queue is empty else it will return peek value
        System.out.print(queue.poll());//return null if queue is empty
        System.out.println(queue.remove()+"\n");// but it will throws an exception
        // if queue is empty,else it will remove peek value

//TODO: always use 1.offer to add element 2.peek to get front value 3.poll to remove front value
        //else rest three will give exception and crash the app.
    }
    public void priorityQueue(){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();//by default min heap
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(Comparator.reverseOrder());//changed to max heap
        //or
        Queue<Integer> queue = new PriorityQueue<>();

        for (int i = 1; i <=10; i++) {
            priorityQueue.offer(i);
            priorityQueue2.offer(i);
        }

        System.out.println(priorityQueue);
        System.out.println(priorityQueue2);//max heap
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());


    }
}
