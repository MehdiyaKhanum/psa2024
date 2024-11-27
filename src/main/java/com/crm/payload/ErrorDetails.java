package com.crm.payload;

import java.util.Date;

public class ErrorDetails {
    private Date date;
    private String message;
    private String request;

    public String getRequest() {
        return request;
    }

    public ErrorDetails(Date date, String message, String request) {
        this.message = message;
        this.date = date;
        this.request = request;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }
}
