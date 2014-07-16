package hello;

import caculate.AddCaculator;
import caculate.Client;
import caculate.ICaculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by dchen on 7/15/14.
 */
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
public class HelloWorldServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String add1=req.getParameter("add1");
        String add2=req.getParameter("add2");
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "SpringBeans.xml");
        Client caculator=(Client) context.getBean("caculateBean");
        //ICaculator caculator=new AddCaculator();
        PrintWriter pw  = resp.getWriter();//得到一个输出流
        pw.println("<html><head></head><body>"+this.getServletContext() +caculator.add("12","23") +"~</body></html>");
        pw.flush();
        pw.close();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doGet(req, resp);
    }

}
