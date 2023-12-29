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
@WebServlet("/challenge")
public class ChallengeController extends HttpServlet {
    private ChallengeService service = new ChallengeService();
    private static final Logger LOGGER = LoggerFactory.getLogger(ChallengeController.class);
    private Integer gameCounter = 0;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Answer answer = service.checkInputText(req.getParameter("buttonValue"));
        if(answer.getAnswerStatus().equals(Answer.ANSWER_TRUE)) {
            req.getRequestDispatcher("climbTheBridge.jsp").forward(req, resp);
            LOGGER.info("Redirect to climbTheBridge.jsp.");
        } else {
            NegativAnsver negativAnsver = (NegativAnsver) answer;
            req.setAttribute("answer", negativAnsver.getMessage());
            req.getRequestDispatcher("gameOver.jsp").forward(req, resp);
            LOGGER.info("Redirect to gameOver.jsp.");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.info("Challenge started.");
        req.getRequestDispatcher("challenge.jsp").forward(req, resp);

    }
}
