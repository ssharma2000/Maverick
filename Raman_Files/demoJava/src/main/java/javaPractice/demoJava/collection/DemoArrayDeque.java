package javaPractice.demoJava.collection;

import java.util.ArrayDeque;

public class DemoArrayDeque {
    public DemoArrayDeque(){
        ArrayDeque<Integer> arrayDeque =  new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            arrayDeque.offer(i);
        }
        System.out.println(arrayDeque);
        arrayDeque.offerLast(-2); //add element from last
        System.out.println(arrayDeque);
        arrayDeque.offerFirst(100); //add from front
        System.out.println(arrayDeque);

        //use peek and poll here too same as queue
//        but
        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.peekLast());
        System.out.println(arrayDeque.pollFirst());
        System.out.println(arrayDeque.pollLast());
        System.out.println(arrayDeque);
    }
}
