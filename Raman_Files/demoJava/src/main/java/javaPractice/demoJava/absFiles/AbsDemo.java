package absFiles;

abstract class AbsDemo1 {
    void sum(){
        System.out.println("super");
    }
    abstract void subs();
    int a;

}
abstract class AbsDemo {
    void sum(){
        System.out.println("super");
    }
    abstract void subs();
    int a;

}
class Car extends AbsDemo{

    @Override
    void sum(){
        super.sum();
        System.out.println("sub class sum method");
    }
    @Override
    void subs(){

        int a=9;
        int b=10;
        System.out.println(b-a);
    }


}

class Temp{

    public static void main(String[] args) {
        Car cr=new Car();
        cr.sum();cr.subs();
        AbsDemo abs=new Car();
        abs.sum();abs.subs();
    }

}


