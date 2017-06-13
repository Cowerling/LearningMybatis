package com.cowerling.domain;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * Created by dell on 2017-6-13.
 */
@Alias("student")
public class Student {
    private Integer id;
    private String name;
    private String email;
    private Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
