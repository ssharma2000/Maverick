package javaPractice.demoJava.mokito;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class MikitoTest {
//    @Mock
    MokitoInterface mokitoInterface= mock(MokitoInterface.class);
//    MokitoClass mokitoClass=new MokitoClass(mokitoInterface);

    MokitoClass mokitoClass = new MokitoClass(mokitoInterface);

    DemoMokitoClass demoMokitoClass = mock(DemoMokitoClass.class);


    @Test
    public void testMokitoClass(){
        when(mokitoInterface.mul()).thenReturn(20);
        when(mokitoInterface.sum()).thenReturn(10);
        when(demoMokitoClass.sub()).thenReturn(100);
        System.out.println("mokitoClass " + demoMokitoClass.sub());
    }

}
