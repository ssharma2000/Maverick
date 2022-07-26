package javaPractice.demoJava.collection;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoMap {
    DemoMap(){
        System.out.println("O(1)");
        Map<String,Integer> map = new HashMap<>();
        for (int i = 1; i < 10; i++) {
            map.put(Integer.toString(i), i);
        }
        map.put("6",8); //it will override the value
        map.putIfAbsent("11",11); // it will not override the value

        //check key present or not
        if (!map.containsKey("8")){
            map.put("8", 90);
        }
        if (!map.containsKey("12")){
            map.put("12", 9);
        }
        System.out.println(map);

        //print by entryset
        for (Map.Entry<String,Integer> itr : map.entrySet()){
            System.out.println(itr +" key "+itr.getKey() +" value "+itr.getValue());
        }
        System.out.println(map.remove("2"));

        //print only key
        for (String itr: map.keySet()){
            System.out.println(" key "+itr );
        }
        //print only value
        for (Integer itr: map.values()){
            System.out.println(" values "+ itr);
        }

        //check contains value
        System.out.println("\n" + map.containsValue(11));

        //check map empty or not
        System.out.println(map.isEmpty());



        //clear the map
        map.clear();
    }

    void DemoTreeMap(){
        //under the hood , it put keys in binary search tree which is sorting the key so,
        // map is storing in sorted manner
        System.out.println("\n tree map O(logn)");
        Map<String,Integer> map = new TreeMap<>();
        for (int i = 1; i < 10; i++) {
            map.put(Integer.toString(i), i);
        }
        map.put("6",8); //it will override the value
        map.putIfAbsent("11",11); // it will not override the value

        //check key present or not
        if (!map.containsKey("8")){
            map.put("8", 90);
        }
        if (!map.containsKey("12")){
            map.put("12", 9);
        }
        System.out.println(map);
        //print by entryset
        for (Map.Entry<String,Integer> itr : map.entrySet()){
            System.out.println(itr +" key "+itr.getKey() +" value "+itr.getValue());
        }

        System.out.println(map.remove("2"));
        //print only key
        for (String itr: map.keySet()){
            System.out.println(" key "+itr );
        }
        //print only value
        for (Integer itr: map.values()){
            System.out.println(" values "+ itr);
        }

        //check contains value
        System.out.println("\n" + map.containsValue(11));

        //check map empty or not
        System.out.println(map.isEmpty());

        //clear the map
        map.clear();


    }
}
