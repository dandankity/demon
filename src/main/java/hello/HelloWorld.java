package hello;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld{
    private static final Logger logger=LoggerFactory.getLogger(HelloWorld.class);

    public  void SayHello(){
        // logger =
        logger.info("Hello World");
        //return "hello";
    }
}
