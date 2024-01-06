package ua.javarush.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.javarush.exception.InvalidParamException;
import ua.javarush.models.Answer;
import ua.javarush.models.NegativAnsver;
import ua.javarush.models.PositiveAnsver;

public class ChallengeService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ChallengeService.class);
    private static final String ANSWER_TRUE = "yes";
    private static final String ANSWER_FALSE = "no";

    public ChallengeService() {
    }

    private static final String CancelChallenge = "You rejected call. \n Game over";

    public Answer checkInputText(String question) {
        Answer answer;
        LOGGER.info("Method checkInputText start.");
        if (question.equalsIgnoreCase(ANSWER_TRUE)) {
            LOGGER.info("Method return true.");
            answer = new PositiveAnsver(ANSWER_TRUE);

        } else if (question.equalsIgnoreCase(ANSWER_FALSE)) {
            LOGGER.info("Method return false.");
            answer = new NegativAnsver(ANSWER_FALSE, CancelChallenge);
        } else {
            throw new InvalidParamException("Invalid param");
        }
        return answer;
    }
}


