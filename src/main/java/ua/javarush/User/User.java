package ua.javarush.User;

import java.util.Objects;

public class User {
    private String text;

    public User(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
