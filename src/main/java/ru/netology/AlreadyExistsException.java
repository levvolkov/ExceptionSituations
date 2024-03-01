package ru.netology;

public class AlreadyExistsException extends RuntimeException {
    public AlreadyExistsException (String s) {
        super(s);
    }
}
