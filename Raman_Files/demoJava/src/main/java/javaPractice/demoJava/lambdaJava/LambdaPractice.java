package lambdaJava;

public class LambdaPractice {
    public static void main(String[] args) {
        System.out.println("lambda practice");
        /*lambda is a anonymous function which has no name,no modifier & no return type.
         *
         *
         * */
//        ForImpl forImpl3=new ForImpl();
//        forImpl3.sum(4,6);

        //or
        FuncIntrf secondObj=new FuncIntrf(){
            @Override
            public int sum(int a, int b) {
                System.out.println("this is first anonymous class "+a+b+"\n");
                return 0;
            }
        };
        secondObj.sum(6,7);
        FuncIntrf secondObj2=new FuncIntrf(){
            @Override
            public int sum(int a, int b) {
                System.out.println("this is first anonymous class "+a+b+"\n");
                return 0;
            }
        };
        secondObj2.sum(8,9);

        //or use lambda expression
        FuncIntrf funcIntrf=(a,b)->a+b;
//            System.out.println("this is lambda "+ a+b);


        System.out.println(funcIntrf.sum(8,6));

    }

    //example
    public void add(int a, int b) {
        System.out.println("example of normal function");
        //this function has name, return type and also modifier i.e: public
        //so if we remove all three then it can look like lambda lets see
    }
    //TODO: NOTE: but it can only be used with functional interface. below is lambda function
    // just by removing three things->name,return type, modifier
//    (int a,int b)->{
//        System.out.println("but it can only be used with functional interface");
//         return a+b;
//    }

    /*

    by using lambda we can say that we entered in [functional programming]-> it means we can pass a function
    in another function as a parameter/argument
    * */

    //benefits-> reduces line of code \ sequential and parallel execution support by passing behavior as an argument in methods
    //to call apis very effectively\ write more readable, maintainable and concise code



    /*NOTE: impo rules
     * lambda expression contain only one expression then curly braces is optional
     * java compiler also infers the type of variable passes in arguments, hence type is optional i.e: (int a,int b) or (a,b)
     * question is how java infers the data type ::: answer is: we will declare in functional interface
     *
     * */
}
