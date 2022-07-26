package javaPractice.demoJava.exp;

public class DemoMain {
    public static void main(String[] args) {
        //System.out.println("experiment collection");
        ImplementedClass implementedClass = new ImplementedClass();
        ListDemo listDemo = new ImplementedClass();
        System.out.println(listDemo.name());
    }
}
class ImplementedClass implements ListDemo{
    void printName(){
        System.out.println("fetched local function");
    }

    @Override
    public int size() {
        System.out.println("fetched implemented function");
        return 10;
    }

    @Override
    public int value() {
        return 100;
    }



//    DIAMOND OPERATOR
    //balendung diamond operator benefit example
    //Consider the following interface and class hierarchy for working with vehicles and engines:
    public interface Engine { }
    public class Diesel implements Engine { }
    public interface Vehicle<T extends Engine> { }
    public class Car<T extends Engine> implements Vehicle<T> { }

    //Let's create a new instance of a Car using the diamond operator:
    Car<Diesel> myCar = new Car<>();
    //Internally, the compiler knows that Diesel implements the Engine interface
    // and then is able to determine a suitable constructor by inferring the type.
}
