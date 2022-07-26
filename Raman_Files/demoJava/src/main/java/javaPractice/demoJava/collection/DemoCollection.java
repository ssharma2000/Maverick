package javaPractice.demoJava.collection;

import java.util.*;

public class DemoCollection {
    public static void main(String[] args) {
        DemoArraysClassPrimitive demoArraysClassPrimitive = new DemoArraysClassPrimitive();
        demoArraysClassPrimitive.DemoCollectionFunctionality();

//        DemoMap demoMap = new DemoMap();
//        demoMap.DemoTreeMap();

//        DemoSet demoSet = new DemoSet();
//        demoSet.DemoLinkedHashSet();
//        demoSet.DemoTreeSet();

//        DemoArrayDeque demoArrayDeque = new DemoArrayDeque();

//        DemoQueue demoQueue= new DemoQueue();
//        demoQueue.priorityQueue();

//        DemoStack demoStack= new DemoStack();

        //demoList();

    }
    static void demoList(){
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> arrayList2 = new ArrayList<>();
        for (int i=0;i<10;i++){
            arrayList.add(i);
        }

        arrayList2.addAll(arrayList);
        arrayList2.add(5);
        arrayList2.set(3,89);

        arrayList2.remove(6);
//        arrayList2.clear();
//        System.out.println(arrayList2 + " " +arrayList2.contains(89));
        for (int i=0;i<arrayList2.size();i++){
            System.out.print(arrayList2.get(i)+" ");
        }
        System.out.println();
        for (Integer itr: arrayList2){
            System.out.print(itr+" ");
        }
        System.out.println();
        Iterator<Integer> itr= arrayList2.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        int a=5;

    }
}
