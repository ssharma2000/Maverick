package generics;

class TempForGenerics<T>{
    Class theClass=null;
    public TempForGenerics(Class theClass){
        this.theClass=theClass;
    }
    public T instanceFunction() throws InstantiationException, IllegalAccessException {
        System.out.println("generics with classes");
        return (T) this.theClass.newInstance();
    }

}


public class GenericsWithClasses {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        //TODO complete this generics at best
        //TODO client server theory ion java using api and backend relations
        //TODO generics classes and function to create object
//        System.out.println("generics with classes");
        TempForGenerics<BasicGenerics> tempForGenerics=new TempForGenerics<BasicGenerics>(BasicGenerics.class);
        BasicGenerics bs=tempForGenerics.instanceFunction();

        System.out.println("generics with classes");

    }
}
