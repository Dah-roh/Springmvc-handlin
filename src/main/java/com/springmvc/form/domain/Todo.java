package com.springmvc.form.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo implements Serializable {
    private int id;
    private String user;
    private String desc;
    private Date targetDate;
    private boolean isDone;

}
