package hello;

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
        PrintWriter pw  = resp.getWriter();//得到一个输出流
        pw.println("<html><head></head><body>"+ new HelloWorld().sayHello() +"~</body></html>");
        pw.flush();
        pw.close();
    }

}
