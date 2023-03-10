package servlets_jsps;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "pizzaServlet", urlPatterns = "/pizza-order")
public class PizzaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/servlets_jsps/pizza.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String crust = request.getParameter("crust_type");
        if(crust != null) {
            System.out.println("Crust: " + crust);
        }

        String sauce = request.getParameter("sauce_type");
        if(sauce != null) {
            System.out.println("Sauce: " + sauce);
        }

        String size = request.getParameter("size_type");
        if(size != null) {
            System.out.println("Size: " + size);
        }

        String pepperoni = request.getParameter("pepperoni");
        if(pepperoni != null) {
            System.out.println("Pepperoni");
        }

        String cheese = request.getParameter("cheese");
        if(cheese != null) {
            System.out.println("Extra cheese");
        }

        String potato = request.getParameter("potato");
        if(potato != null) {
            System.out.println("Potato");
        }

        String fish = request.getParameter("fish");
        if(fish != null) {
            System.out.println("Fish");
        }

        String hamster = request.getParameter("hamster");
        if(hamster != null) {
            System.out.println("Hamster");
        }

        String address = request.getParameter("address");
        if(address != null) {
            System.out.println("Address: " + address);
        }

        request.getRequestDispatcher("/servlets_jsps/pizza.jsp").forward(request, response);

    }
}
