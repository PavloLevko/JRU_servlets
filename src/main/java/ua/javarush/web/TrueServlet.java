package ua.javarush.web;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.javarush.User.User;
import ua.javarush.service.UserService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/true")
public class TrueServlet extends HttpServlet {
    private UserService userService = new UserService();
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServlet.class);
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User(req.getParameter("text"));
        if (userService.checkInputText(user.getText())) {
            req.getRequestDispatcher("return.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("gameOver.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.info("TrueServlet started");
        req.getRequestDispatcher("ufo.jsp").forward(req, resp);
    }
}
