package ua.javarush.service;

import org.junit.jupiter.api.Test;
import ua.javarush.exception.InvalidParamException;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    private static final String ANSWER_TRUE = "yes";
    private static final String ANSWER_FALSE = "no";
    private static final String ANSWER_SOME_TEXT = "some text";
    @Test
    void testCheckInputTextYes() {
        UserService userService = new UserService();
        boolean expected = true;
        boolean result = userService.checkInputText(ANSWER_TRUE);
        assertEquals(expected,result);
    }
    @Test
    void testCheckInputTextNO() {
        UserService userService = new UserService();
        boolean expected = false;
        boolean result = userService.checkInputText(ANSWER_FALSE);
        assertEquals(expected,result);
    }
    @Test
    void testCheckInputTextExceptio() {
        UserService userService = new UserService();
       assertThrowsExactly(InvalidParamException.class,
               () -> userService.checkInputText(ANSWER_SOME_TEXT));
    }
}