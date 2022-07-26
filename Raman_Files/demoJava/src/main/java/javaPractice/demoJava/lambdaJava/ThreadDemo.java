package lambdaJava;

public class ThreadDemo {
    public static void main(String[] args) {
//        System.out.println("thread demo");
        Runnable runnable=()->{
            for (int i=0;i<10;i++) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        Thread th=new Thread(runnable);
//        th.setName("demo");
        th.start();


    }
}
