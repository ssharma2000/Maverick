package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    //stream api- collection process
    //perform on collection, group of objects
    public void streamTemp(){
        //create blank stream
        Stream<Object> tempStream=Stream.empty();
        tempStream.forEach(itr-> System.out.println(itr));

        //2-d array, object, collection
        String names[]={"raman","kumar","nirala"};
        Stream<String> streamString=Stream.of(names);
        streamString.forEach(itr-> System.out.print(itr+" "));

        //3. builder pattern
        Stream<Object> temp2=Stream.builder().build();

        //4. using arrays ka stream method
        IntStream stream = Arrays.stream(new int[]{2, 4, 5, 6, 8, 9});
        stream.forEach(itr-> System.out.println(itr));

        //5. list , set
        //child class k obj ko parent class k object me store kr skte h aram se



    }
}
class MethodsFun{
    void methodFunc(){
        //TODO: impo methods in stream
        //filter(predicate) i.e predicate is boolean valued function but filter is filter
        // the elements based on predicate return value
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        // or
        List<Integer> list2=List.of(0,1,3,2,4,5);

        List<Integer> tempList = list.stream().filter(integer -> integer%2==0).collect(Collectors.toList());
        System.out.println(tempList);

        //map(function) .. it will not use predicate because it will accept the value so, it will
        //maintain operation in function , based on function it will again store the elements
        //we will pick one value from map and again store one value corresponding so, we will use function not predicate
        //beacuse predicate returns true/false but we need a return of elements/value so, function used here
        List<Integer> mapAns=list.stream().map(itr->itr*itr).collect(Collectors.toList());
        System.out.println(mapAns);
        //or
        mapAns.stream().forEach(itr-> System.out.println(itr));
        //or
        mapAns.stream().forEach(System.out::println);


        //sort the list
        list2.stream().sorted().forEach(System.out::println);//also we can customize the logic of sort in sorted

        //minimum in list
        Integer itr=list2.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println(itr);
        //max in list

        Integer itr2=list2.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(itr2);


    }
}