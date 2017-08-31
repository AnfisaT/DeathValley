package anfisa.apps.userblanklist.servlet;

import anfisa.apps.userblanklist.DBFinders.Reachest;
import anfisa.apps.userblanklist.DBFinders.Sum;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Anfisa on 11.08.2017.
 */

@WebServlet("/s")
public class UsersAccountsServlet extends HttpServlet{

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Sum s = new Sum();
        Reachest r = new Reachest();

        if (req.getRequestURL().toString().equals("anfisa/apps/userblanklist/")){
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter out = resp.getWriter();
            out.println("<html>");
            out.println("<head><title>Servlet1</title></head>");
            out.println("<body>");
            out.println("<table border = '1'>");
            out.println("<tr>");
            out.println("The reachest User");
            out.println("/<tr>");
            out.println("</table>");
            out.println("<form>");
            out.println("<input type = \"button\" name = \"get1\" value = \"Get\" />");
            out.println("</form>");
            out.println("<table border = '1'>");
            out.println("<tr>");
            out.println("The sum of all accounts");
            out.println("/<tr>");
            out.println("</table>");
            out.println("<form>");
            out.println("<input type = \"button\" name = \"get2\" value = \"Get\" />");
            out.println("</form>");
            out.println("</body>");
            out.println("<html>");
            out.close();
        }
        else if(req.getRequestURL().toString().equals("anfisa/apps/userblanklist/get2")){
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter out = resp.getWriter();
            out.println("<html>");
            out.println("<head><title>Servlet1</title></head>");
            out.println("<body>");
            out.println("<table border = '1'>");
            out.println("<tr>");
            out.println("The reachest User");
            out.println("/<tr>");
            out.println("</table>");
            out.println("<form>");
            out.println("<input type = \"button\" name = \"get1\" value = \"Get\" />");
            out.println("</form>");
            out.println("<table border = '1'>");
            out.println("<tr>");
            out.println(s.GetAccountSum());
            out.println("/<tr>");
            out.println("</table>");
            out.println("<form>");
            out.println("<input type = \"button\" name = \"get2\" value = \"Get\" />");
            out.println("</form>");
            out.println("</body>");
            out.println("<html>");
            out.close();
        }
        else if(req.getRequestURL().toString().equals("anfisa/apps/userblanklist/get1")){
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter out = resp.getWriter();
            out.println("<html>");
            out.println("<head><title>Servlet1</title></head>");
            out.println("<body>");
            out.println("<table border = '1'>");
            out.println("<tr>");
            out.println(r.GetReachest().GetName()+r.GetReachest().GetSureName());
            out.println("/<tr>");
            out.println("</table>");
            out.println("<form>");
            out.println("<input type = \"button\" name = \"get1\" value = \"Get\" />");
            out.println("</form>");
            out.println("<table border = '1'>");
            out.println("<tr>");
            out.println("The sum of all accounts");
            out.println("/<tr>");
            out.println("</table>");
            out.println("<form>");
            out.println("<input type = \"button\" name = \"get2\" value = \"Get\" />");
            out.println("</form>");
            out.println("</body>");
            out.println("<html>");
            out.close();

        }


    }

}
