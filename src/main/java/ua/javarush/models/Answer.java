package ua.javarush.models;

public abstract class Answer {
    public static final String ANSWER_TRUE = "yes";
    public static final String ANSWER_FALSE = "no";
    private String answerStatus;

    public Answer(String answerStatus) {
        this.answerStatus = answerStatus;
    }
    public String getAnswerStatus() {
        return answerStatus;
    }

    public void setAnswerStatus(String answerStatus) {
        this.answerStatus = answerStatus;
    }
}
