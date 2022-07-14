package kz.bitlab.servlets;

import kz.bitlab.db.MGUsers;
import kz.bitlab.db.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<html>");
        out.print("<head>");
        out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">");
        out.print("</head>");
        out.print("<body class='container'>");
        out.print("<div class='row mt-3'>");
        out.print("<div class='col-10 mx-auto'>");
        out.print("<table class='table table-striped'>");
        out.print("<thead>");
        out.print("<tr>");
        out.print("<th>Name</th>");
        out.print("<th>Surname</th>");
        out.print("<th>Department</th>");
        out.print("<th>Salary</th>");
        out.print("</tr>");
        out.print("</thead>");
        out.print("<tbody>");
        ArrayList<User> users = MGUsers.getAllUsers();
        for (User usrs : users ){
            out.print("<tr><td>" + usrs.getName()+ "</td><td>" + usrs.getSurname() + "</td><td>" + usrs.getDepartment() + "</td><td>" + usrs.getSalary() + "</td>");
        }
        out.print("</tbody>");
        out.print("</table>");
        out.print("</div>");
        out.print("</div>");
        out.print("</body>");
        out.print("</html>");

    }
}