package lambdaJava;

public interface FuncIntrf {
    /*if an interface contains only one abstract method then it is functional interface. note: this method should be abstract
    * ex: runnable,callable,comparable methods etc. (these methods used in threads)
    * to call lambda we require functional interface
    * lambda is used to implement functional interface in very simple and short manner
    * */
    public abstract int sum(int a,int b);
    //if we don't write public abstract still it will add inside interface
}
