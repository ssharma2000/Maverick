package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class demo1 {
    public static <T> T func1(T element, Collection<T> collection) {
        T valueDef= (T) (element+" read");
        //collection.add(valueDef);
        return valueDef;
    }
}


public class GenericsWithMethods {
    public static void main(String[] args) {
        demo1 d1=new demo1();
        String str="Message";
        List<String> list=new ArrayList<String>();
        System.out.println(d1.func1(str,list));
    }
}
