import javax.servlet.*;
import java.io.*;
public class MyFirstServlet extends GenericServlet
{
   public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException
   {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        pw.println("<html>");
        pw.println("<head><title>First Servlet App</title></head>");
        pw.println("<body>");
        pw.println("<h2>Welcome To Java Backend</h2>");
        pw.println("</body>");
        pw.println("</html>");
        pw.close();
   }
}
//import javax.servlet.*;
//        import java.io.*;
//        import javax.servlet.http.*;
//        import java.util.*;
//public class MyDateTimeServlet extends HttpServlet
//{
//    protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
//    {
//        resp.setContentType("text/html");
//        PrintWriter pw=resp.getWriter();
//        pw.println("<html>");
//        pw.println("<head><title>Date Time Servlet</title>");
//        pw.println("<style>h2{color: crimson;}</style></head>");
//        pw.println("<body>");
//        Date today=new Date();
//        pw.println("<p>Current date and time</p>");
//        pw.println("<h2>"+today+"</h2>");
//        pw.println("</body>");
//        pw.println("</html>");
//        pw.close();
//    }
//}
