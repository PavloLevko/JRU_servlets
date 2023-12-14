package ua.javarush.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.javarush.User.User;
import ua.javarush.exception.InvalidParamException;
import ua.javarush.web.UserServlet;

public class UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    private static final String ANSWER_TRUE = "yes";
    private static final String ANSWER_FALSE = "no";
    public UserService() {
    }

    public boolean checkInputText(String text){
        LOGGER.info("Method checkInputText start.");
    if (text.equalsIgnoreCase(ANSWER_TRUE)) {
        LOGGER.info("Method return true.");
        return true;
    }else {
        if (text.equalsIgnoreCase(ANSWER_FALSE)){
            LOGGER.info("Method return false.");
            return false;
        }else {
            LOGGER.warn("Wrong input data.");
            throw new InvalidParamException("Please input only \"Yes\" or  \"No\"");
        }
    }

    }


}
