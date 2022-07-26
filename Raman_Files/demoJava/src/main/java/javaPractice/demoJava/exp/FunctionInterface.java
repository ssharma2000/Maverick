package javaPractice.demoJava.exp;

import java.util.function.Function;

public class FunctionInterface{
    public static void main(String[] args) {
        //apply()
        Function<Integer, Double> function= a-> a/2.0;
        System.out.println(function.apply(10));

        //andThen() return nullPointerException so use try catch
        //It returns a composed function wherein the parameterized function will be executed after the first one.
        // If evaluation of either function throws an error, it is relayed to the caller of the composed function.
        function = function.andThen(a-> 4*a);
        System.out.println(function.apply(10));

        //compose() return nullPointerException so use try catch
        //It returns a composed function wherein the parameterized function will be executed first and then the first one.
        // If evaluation of either function throws an error, it is relayed to the caller of the composed function.
        function = function.compose(a-> 7*a);
        System.out.println(function.apply(10));

        //This method returns a function that returns its only argument.
        Function<Object, Object> function2= Function.identity();
        System.out.println(function2.apply(10));

    }
}