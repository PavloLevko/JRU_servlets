package ua.javarush.service;

import org.junit.jupiter.api.Test;
import ua.javarush.exception.InvalidParamException;
import ua.javarush.models.Answer;
import ua.javarush.models.NegativAnsver;
import ua.javarush.models.PositiveAnsver;

import static org.junit.jupiter.api.Assertions.*;


class ChallengeServiceTest {
    ChallengeService challengeService = new ChallengeService();

    @Test
    public void checkInputTextYes() {
        String textYes = "yes";
        Answer answerYes = new PositiveAnsver(textYes);
        String expected = answerYes.getAnswerStatus();
        assertEquals(expected, challengeService.checkInputText(textYes).getAnswerStatus());
    }

    @Test
    public void checkInputTextNo() {
        String textNo = "no";
        Answer answerNo = new NegativAnsver(textNo);
        String expected = answerNo.getAnswerStatus();
        assertEquals(expected, challengeService.checkInputText(textNo).getAnswerStatus());
    }

    @Test
    public void checkInputTextException() {
        String someText = "qwert";
        String massageException = "Invalid param";
        Answer answer = new NegativAnsver(someText);
        assertThrows(InvalidParamException.class, () -> challengeService.checkInputText(someText).getAnswerStatus(), massageException);
    }
}