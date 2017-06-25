package com.cowerling.domain;

import org.apache.ibatis.type.Alias;

/**
 * Created by dell on 2017-6-23.
 */
@Alias("userPic")
public class UserPic {
    private int id;
    private String name;
    private byte[] picture;
    private String biography;

    public UserPic() {}

    public UserPic(String name, byte[] picture, String biography) {
        this.name = name;
        this.picture = picture;
        this.biography = biography;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
