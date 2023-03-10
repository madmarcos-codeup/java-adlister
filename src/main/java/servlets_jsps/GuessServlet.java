package servlets_jsps;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
    private int answer = pickAnswer();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/servlets_jsps/guess.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String guess = request.getParameter("guess");
        try {
            int userGuess = Integer.parseInt(guess);
            if(userGuess == answer) {
                answer = pickAnswer();
                response.sendRedirect("/correct");
                return;
            }
            if(userGuess >= 1 && userGuess <= 3) {
                response.sendRedirect("/incorrect");
                return;
            }
        } catch(Exception e) {
            System.out.println("Bad user: " + guess);
        }
        request.setAttribute("errorMessage", "No really, pick a number from 1 to 3");
        request.getRequestDispatcher("/servlets_jsps/guess.jsp").forward(request, response);
    }

    private int pickAnswer() {
        int newAnswer = ((int) (Math.random() * 3)) + 1;
        System.out.println("New answer is " + newAnswer);
        return newAnswer;
    }
}
