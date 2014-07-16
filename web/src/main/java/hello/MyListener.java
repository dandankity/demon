package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by dchen on 7/15/14.
 */
public class MyListener implements ServletContextListener {
    private ApplicationContext app;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
       // app= WebApplicationContextUtils.getWebApplicationContext(servletContext);
       // app.getBean("LinkCaculator");
        app = new ClassPathXmlApplicationContext(
                "SpringBeans.xml");
       // servletContext.setAttribute("caculateBean", app.getBean("caculateBean"));
        servletContext.setAttribute("appBean", app);


    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
