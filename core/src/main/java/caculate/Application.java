package caculate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dchen on 7/15/14.
 */
public class Application {

    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "SpringBeans.xml");
        Client caculator=(Client) context.getBean("caculateBean");
        System.out.println(caculator.add("12", "67"));
       /* Client client = new Client();
        client.setCaculator(new LinkCaculator());
        System.out.println(client.add("12", "67"));
        client.setCaculator(new AddCaculator());
        System.out.println(client.add("12", "67")); */
    }
}

