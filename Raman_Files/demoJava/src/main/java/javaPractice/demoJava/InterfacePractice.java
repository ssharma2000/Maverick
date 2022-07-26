import generics.GenericsWithClasses;
import intfcFiles.IntrfDemo;


import org.junit.*;

import static junit.framework.TestCase.assertEquals;


public class InterfacePractice {
    //TODO how to use import and extend(inheritance)
//    static BaseClass ifcl=new BaseClass();
//    static IntrfDemo<Car> ifc=new BaseClass();
    public static void main(String[] args){
//        Car car=ifc.produce();
//        ifcl.print();
       // Car car=(Car) ifc.produce();
        //IntrfDemo intrfDemo= (IntrfDemo)ifc;
//        intrfDemo.setUp2("terminator");
    //    JunitForTestClass j1=new JunitForTestClass();
    //    j1.checkTest();

        System.out.println("hello");
    }


}
//class Car{
//}
//enum ValEnum{
//    HIGH,
//    MID,
//    LOW
//}
//class BaseClass implements IntrfDemo<Car> {
//    void print() {
//        for (ValEnum valEnum: ValEnum.values() ){
//            System.out.println(valEnum);
//        }
//    }
//    @Override
//    public Car produce(){
//        return new Car();
//    }
//}


//class JunitForTestClass{
//
//public void testC() {
//    @BeforeClass
//    void printMessage () {
//        System.out.println("message before");
//    }
//    @Before
//    void printEvery () {
//        System.out.println("message print for 2 test cases");
//    }
//    @AfterClass
//    void printAfter () {
//        System.out.println("after every");
//    }
//    @After
//    void printEveryAfter () {
//        System.out.println("print after every test");
//    }
//    @Test
//    void checkTest () {
//        assertEquals(16, TestClass.add(8, 8));
//    }
//    @Test
//    void checkTest2 () {
//        assertEquals(16, TestClass.mul(8, 8));
//    }
//}
//
//}
