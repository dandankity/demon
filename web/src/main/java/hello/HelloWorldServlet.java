package hello;
import hello.HelloWorld;

import java.io.IOException;

/**
 * Created by dchen on 7/15/14.
 */
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class HelloWorldServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        //super.doGet(req, resp);
        PrintWriter pw  = resp.getWriter();//得到一个输出流
        HelloWorld helloWorld=new HelloWorld();
        String str=helloWorld.SayHello();
        //写给Client端一个简单网页信息
        pw.println("<html><head></head><body>"+str+"~</body></html>");
        pw.flush();
        pw.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.doPost(req, resp);
    }
}
