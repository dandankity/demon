package hello;

import caculate.AddCaculator;
import caculate.Client;
import caculate.LinkCaculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by dchen on 7/15/14.
 */
public class CaculateServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String add1 = req.getParameter("add1");
        String add2 = req.getParameter("add2");
       // Client caculator=(Client)this.getServletContext().getAttribute("caculateBean");
        ApplicationContext applicationContext=(ApplicationContext)this.getServletContext().getAttribute("appBean");
        Client caculator=(Client)applicationContext.getBean("caculateBean");
        //ICaculator caculator=new AddCaculator();
        PrintWriter pw = resp.getWriter();//得到一个输出流
        pw.println("<html><head></head><body>" + caculator.add("12", "23") + "~</body></html>");
        pw.flush();
        pw.close();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doGet(req, resp);
    }




}
