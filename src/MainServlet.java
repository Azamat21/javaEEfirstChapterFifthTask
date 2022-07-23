
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;


@WebServlet(value = "/main")

public class MainServlet extends HttpServlet {



    @Override

    protected void doPost(HttpServletRequest request,

                          HttpServletResponse response) throws ServletException, IOException {

    }



    @Override

    protected void doGet(HttpServletRequest request,

                         HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.print("<html>");
        out.print("<head>");
        out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" " +
                "rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" " +
                "crossorigin=\"anonymous\">");
        out.print("<style>");
        out.print("*{" +
                "margin:20px;" +
                "padding:5px;" +
                "}" +
                "input{" +
                "margin:5px;" +
                "}");
        out.print("</style>");
        out.print("</head>");
        out.print("<body>");
        out.print("<div class='mx-auto' style='width:350px'>");
        out.print("<form action='/func' method='post'>");
        out.print("<table style='border-spacing:20px;border:1px solid lightgray;width:350px; margin:5px;'>");
        out.print("<tr>");
        out.print("<td>FULL NAME:</td><td><input type='text' name='user_name' placeholder='Name'></td>");
        out.print("</tr>");
        out.print("<tr>");
            out.print("<td>AGE:</td><td><select name='user_age'>");
            for(int i = 0;i<70;i++) {
                out.print("<option>" + i + "</option>");
            }
            out.print("</select></td>");
            out.print("</tr>");
        out.print("<tr>");
        out.print("<td>Gender:</td><td><input type='radio' name='gender' value='male'>male<br>" +
                "<input type='radio' name='gender' value='female'>female</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td></td><td><button>Add</button></td>");
        out.print("</tr>");
        out.print("</table>");
        out.print("</form>");
        out.print("</div>");
        out.print("</body>");
        out.print("</html>");

    }

}