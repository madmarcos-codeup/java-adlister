package servlets_jsps;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ViewColorServlet", urlPatterns = "/viewcolor")
public class ViewColorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String color = request.getParameter("color");

        //System.out.println(color.length());
        if(color == null || color.length() == 0) {
            response.sendRedirect("/pickcolor");
            return;
        }

        request.setAttribute("color", color);
        request.getRequestDispatcher("/servlets_jsps/viewcolor.jsp").forward(request, response);

    }

}
