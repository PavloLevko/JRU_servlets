package ua.javarush.models;

public class NegativAnsver extends Answer{
    String message;
    public NegativAnsver(String answerStatus) {
        super(answerStatus);
    }

    public NegativAnsver(String answerStatus, String message) {
        super(answerStatus);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
