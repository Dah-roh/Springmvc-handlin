package com.springmvc.form.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Todo implements Serializable {
    private int id;
    private String user;
    private String desc;
    private Date targetDate;
    private boolean isDone;

}
