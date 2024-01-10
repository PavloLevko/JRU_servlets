package ua.javarush.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.javarush.models.Answer;
import ua.javarush.models.NegativAnsver;
import ua.javarush.service.ChallengeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/gameOver")
public class GameOverController extends HttpServlet {
    private static final Logger LOGGER = LoggerFactory.getLogger(ChallengeController.class);
    private ChallengeService service = new ChallengeService();
    public String endOver = "gameOver.jsp";
    public String nextPage = "welcome.jsp";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Answer answer = service.checkInputText(req.getParameter("buttonValue"));
        req.setAttribute("answer", answer);
        req.getRequestDispatcher(service.getRedirectPath(answer, endOver, nextPage)).forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.info("GameOver started.");
        req.getRequestDispatcher("gameOver.jsp").forward(req, resp);
    }
}