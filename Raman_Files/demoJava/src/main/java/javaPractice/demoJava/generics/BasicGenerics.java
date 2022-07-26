package generics;

import java.util.*;

public class BasicGenerics {
    public static void main(String[] args) {
//TODO experiments based on collections
        List<String> strings = new ArrayList<String>();
        strings.add("ele1");
        strings.add("ele2");
        strings.add("ele3");
        Iterator<String> itr=strings.iterator();

//        for(String str:strings)
//            System.out.println(str);

        Set<String> set=new HashSet<>();
        set.add("ele4");
        set.add("ele4");
        set.add("ele5");
//        for(String str:set)
//            System.out.println(str);
        Map<String,Integer> map=new HashMap<>();
        map.put("ele6",98);
        map.put("ele7",98);
        map.put("ele8",98);
        int a=map.get("ele6");
        System.out.println(a);
        Iterator<String> itrMap=map.keySet().iterator();
//        while (itrMap.hasNext()){
//            String a2=itrMap.next();
//            Integer a3=map.get(itrMap);
//            System.out.println(a2+" " +a3.);
//        }
        for(String str2:map.keySet()){
            Integer var2=map.get(str2);
            System.out.println(str2+" "+var2);
        }
        for(Integer str2:map.values()){
            System.out.println(str2);
        }
//        for(String str:set)
//            System.out.println(str);


    }
}
