import hello.HelloWorld;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testSayHello() {
        HelloWorld h=new HelloWorld();
        h.SayHello();
        //String actual= h.SayHello();
        //assertEquals("hello",actual);
    }


}