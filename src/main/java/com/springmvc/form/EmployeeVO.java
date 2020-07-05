package com.springmvc.form;

import java.io.Serializable;
@Data
public class EmployeeVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

}
