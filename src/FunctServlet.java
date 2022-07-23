import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.io.PrintWriter;


@WebServlet(value = "/func")

public class FunctServlet extends HttpServlet {



    @Override

    protected void doPost(HttpServletRequest request,

                          HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("user_name");
        int age = Integer.parseInt(request.getParameter("user_age"));
        String gender = request.getParameter("gender");

        out.print("<html>");
        out.print("<head>");
        out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" " +
                "rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" " +
                "crossorigin=\"anonymous\">");
        out.print("</head>");
        out.print("<body>");
        out.print("<div class='mx-auto' style='width:280px'>");
//        if(age>=18 && gender.equals("male")){
//            out.print("<p style='font-size:20px' class='container-fluid text-justify text-align'>Hello Dear"+"Mister"+name+"!</p>");
//        }
//        if(age<18 && gender.equals("female")){
//            out.print("<p style='font-size:20px' class='container-fluid text-justify text-align'>Hello Dude"+"Mister"+name+"!</p>");
//        }
        String ms = "";
        String de = "";
        if(age>=18){
            de="Dear";
        }
        else if(age<18){
            de="Dude";
        }
        if(gender.equals("male")){
            ms="Mister";
        }
        else ms="Miss";
        out.print("<p style='font-size:30px;font-weight:500;' class='container-fluid text-justify text-align'>Hello"+" "+de+" "+ms+" "+name+"!</p>");
        out.print("</div>");
        out.print("</body>");
        out.print("</html>");
    }



    @Override
    protected void doGet(HttpServletRequest request,

                         HttpServletResponse response) throws ServletException, IOException {

        System.out.println("This is Apply page");


    }

}