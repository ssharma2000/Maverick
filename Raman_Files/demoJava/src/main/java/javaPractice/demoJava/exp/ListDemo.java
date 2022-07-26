package javaPractice.demoJava.exp;

public interface ListDemo {
    int size();
    int value();
    default int name(){
        return 55;
    }
}
