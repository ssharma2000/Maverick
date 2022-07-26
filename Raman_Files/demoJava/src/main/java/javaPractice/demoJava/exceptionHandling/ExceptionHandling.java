package exceptionHandling;
class Test1{
    public void div(int a,int b) {
        String ae=null;
        try{
            System.out.println(a/b);

            }
        catch(ArithmeticException e){
            System.out.println(e);
        }
//        System.out.println(0b101);
//        System.out.println(123_456);
//        //char c=61;
//        System.out.println((char)97);
        var y=90;
        char str=(char)y;
        System.out.println(y);
    }
}


public class ExceptionHandling {
    public static void main(String[] args) {
        //System.out.println("Exception Handling");
        Test1 t1=new Test1();
        t1.div(5,0);
    }
}
