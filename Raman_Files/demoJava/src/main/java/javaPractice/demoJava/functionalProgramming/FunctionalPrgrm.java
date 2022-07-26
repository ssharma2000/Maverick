package functionalProgramming;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Prop{
    Long stremFunc() {
        List<String> stringList = new ArrayList<String>();

        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");

        Stream<String> stream = stringList.stream();

        Long count =
                stream.map((value) -> {
                    return value.toLowerCase();
                }).count();
        return count;
    }
}

public class FunctionalPrgrm {
    public static void main(String[] args) {
        Prop pr=new Prop();
        Long store=pr.stremFunc();
        System.out.println(store);
    }

}

