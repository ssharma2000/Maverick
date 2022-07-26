package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
    public static void main(String[] args) {
        System.out.println("demo stream api");
//        CollectionForStream collectionForStream=new CollectionForStream();
//        collectionForStream.temp();
        StreamObject streamObject=new StreamObject();
        streamObject.streamTemp();
    }
}


/*
* stream related to collection frameworks/group of object
* ioStream is for read and write the data from source to destination, it is known as sequence of flow of data
* stream is for process group of data/object/collection . so stream and ioStream are different things
* stream api is basically perform bulk operations and process the objects of collection
* stream reduce the code length
*
* */
class CollectionForStream{
    public void temp(){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list);
        Stream<Integer> stream=list.stream();
        //predicate
        List<Integer> tempList = list.stream().filter(integer -> integer%2==0).collect(Collectors.toList());
        System.out.println(tempList);
    }
}