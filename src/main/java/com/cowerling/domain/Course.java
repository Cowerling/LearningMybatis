package com.cowerling.domain;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * Created by dell on 2017-6-21.
 */
@Alias("course")
public class Course {
    private Integer id;
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private Integer tutorId;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getTutorId() {
        return tutorId;
    }

    public void setTutorId(Integer tutorId) {
        this.tutorId = tutorId;
    }

    @Override
    public String toString() {
        return name + ": " + description + ", " + startDate + "-" + endDate;
    }
}
