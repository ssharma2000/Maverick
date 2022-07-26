package javaPractice.demoJava.collection;

import java.util.Stack;

public class DemoStack {
    public DemoStack(){
//        System.out.println("stack");
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<10;i++){
            stack.push(i);
        }
        stack.remove(4);
        for (Integer itr:stack)
            System.out.print(itr+" ");
        System.out.println();
        System.out.println(stack.get(4)+" size "+stack.size()+" peek "+stack.peek()+" pop "+stack.pop()+" peek "+stack.peek());

    }
}