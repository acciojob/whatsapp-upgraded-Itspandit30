package com.driver;

import java.util.Date;

public class Message {
    private int id;
    private String content;
    private Date timestamp = new Date();

    public Message(int id, String content, Date timestamp)
    {
        this.id = id;
        this.content = content;
        this.timestamp  = timestamp;
    }
}
