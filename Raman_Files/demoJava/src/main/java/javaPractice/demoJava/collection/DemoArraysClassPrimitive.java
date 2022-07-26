package javaPractice.demoJava.collection;

import java.util.*;

public class DemoArraysClassPrimitive {
    DemoArraysClassPrimitive(){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(arr, 5);
        System.out.println("index is "+index);
        Arrays.sort(arr);
        for (int i: arr)
            System.out.print(i+" ");
        System.out.println();
        Arrays.fill(arr,12);
        for (int i: arr)
            System.out.print(i+" ");
        System.out.println();
        //parallel sort must have elements more than 8192  other wise it run on quick sort ...read about



    }
    void DemoCollectionFunctionality(){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println("minimum element "+ Collections.min(list));
        System.out.println("minimum element "+ Collections.max(list));
        System.out.println(Collections.frequency(list,9));
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
