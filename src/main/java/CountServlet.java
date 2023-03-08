import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "countServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {
    private int count = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String reset = request.getParameter("reset");
        if(reset != null && reset.equalsIgnoreCase("true")) {
            count = 0;
        }
        count++;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>" + count + "</h1>");

    }
}
