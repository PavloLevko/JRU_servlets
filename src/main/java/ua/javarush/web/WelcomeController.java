package ua.javarush.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/")
public class WelcomeController extends HttpServlet {
    private static final Logger LOGGER = LoggerFactory.getLogger(WelcomeController.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.info("Welcome started.");
        req.getRequestDispatcher("welcome.jsp").forward(req, resp);
        HttpSession session = req.getSession();
        String name = (String) session.getAttribute("name");
    }
}
