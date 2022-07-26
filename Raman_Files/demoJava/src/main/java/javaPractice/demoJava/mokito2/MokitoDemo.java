package mokito;

public class MokitoDemo {
    public static void main(String[] args) {
        System.out.println("mokito "+number());

    }
    public static int number(){
        int value2=0;
        switch (2){
            case 0 -> value2=1;
            case 1, 2 -> value2=6;
            default -> {
                return 10;
            }
        };
        return value2;
    }
}
