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
    private PhoneNumber phoneNumber;
    private Address address;
    private Gender gender;

    public Student() {}

    public Student(String name, String email, Date birthday) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
    }

    public Student(int id, String name, String email, Date birthday) {
        this(name, email, birthday);
        this.id = id;
    }

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

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}
