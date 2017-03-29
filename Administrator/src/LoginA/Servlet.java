package LoginA;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Dima on 3/19/2017.
 */
@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.println(name);
        printWriter.println(password);
    if (name != "" & password != "")
        response.sendRedirect("two.jps");
    else
        System.out.println("Поле пароль або користучвач не заповнені");

    }

}
