package javaPractice.demoJava.mokito;

public class MokitoClass{
    MokitoInterface mokitoInterface;
    public MokitoClass(MokitoInterface mokitoInterface){
        this.mokitoInterface = mokitoInterface;
    }
     DemoMokitoClass demoMokitoClass;

    public int answerTemp(){
        return mokitoInterface.mul()/mokitoInterface.sum()+mokitoInterface.a;
    }
}

//        return mokitoInterface.mul()+mokitoInterface.sum();