package javaPractice.demoJava.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {
    public DemoSet(){
        Set<Integer> set = new HashSet<>();
        //O(1) clear /find / add

        for (int i = 1; i < 10; i++) {
            set.add(i);
            set.add(10-i);
        }

        System.out.println(set);
        System.out.println(set.contains(5)); // if present or not ...return true/false
        System.out.println(set.remove(5));// remove element and return true and false based on presence
        System.out.println(set.remove(12));

        System.out.println(set.isEmpty());
        System.out.println(set.size());

        set.clear();
        System.out.println(set);
    }

    public void DemoLinkedHashSet(){
        System.out.println("\n");
        Set<Integer> set = new LinkedHashSet<>();

        //provide set property also property of linked list
        // means value will be as it is as it pushed
// but not storing in sorted form
        for (int i = 1; i < 10; i++) {
            set.add(i);
            set.add(10-i);
        }

        System.out.println(set);
        System.out.println(set.contains(5)); // if present or not ...return true/false
        System.out.println(set.remove(5));// remove element and return true and false based on presence
        System.out.println(set.remove(12));

        System.out.println(set.isEmpty());
        System.out.println(set.size());

        set.clear();
        System.out.println(set);

    }

    public void DemoTreeSet(){
        System.out.println("\nyou are seeing O(logn) add/ remove/ find -- TreeSet");
        Set<Integer> set = new TreeSet<>();
        //O(logn) add/ remove/ find
        //benefit is -> behind the scene it is applying binary search tree + set,
        // so it stores in sorted manner
        for (int i = 1; i < 10; i++) {
            set.add(i);
            set.add(10-i);
        }
        System.out.println(set);
        System.out.println(set.contains(5)); // if present or not ...return true/false
        System.out.println(set.remove(5));// remove element and return true and false based on presence
        System.out.println(set.remove(12));

        System.out.println(set.isEmpty());
        System.out.println(set.size());

        set.clear();
        System.out.println(set);

    }
}
