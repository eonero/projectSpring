package com.javaproject.course.service.exceptions;

public class DatabaseException extends  RuntimeException {

    public DatabaseException(String msg) {
        super(msg);
    }
}
