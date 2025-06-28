import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class MyDateTimeServlet extends HttpServlet
{
    protected  void doGet(HttpServletRequest req,HttpServletResponse resp)throws IOException,ServletException
    {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        pw.println("<html><head><title>Date Time Display</title>");
        pw.println("<style type='text/css'>");
        pw.println("h3{ color: red;}");
        pw.println("</style></head>");
        Date today=new Date();
        String str=today.toString();
        pw.println("<body>");
        pw.println("Current date and time : <h3>"+str+"</h3>");
        pw.println("</body></html>");
        pw.close();
     }
 }
