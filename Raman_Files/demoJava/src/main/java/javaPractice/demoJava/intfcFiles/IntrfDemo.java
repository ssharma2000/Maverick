package intfcFiles;

public interface IntrfDemo {

    int a = 7;
    static void prod(){
        System.out.println("static function in interface");
    }
    default void div(){
        System.out.println("default in interf demo");
    }
}
interface IntrfDemo2{
    void div();
}
class Demo implements IntrfDemo2,IntrfDemo{
    @Override
    public void div(){
        System.out.println("super produce "+a);
        try{
            int b=a/0;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    
}
class Car{
    public static void main(String[] args) {
        Demo dc2=new Demo();
        dc2.div();
    }
}
