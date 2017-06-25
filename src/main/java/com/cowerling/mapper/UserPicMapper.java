package com.cowerling.mapper;

import com.cowerling.domain.UserPic;

/**
 * Created by dell on 2017-6-23.
 */
public interface UserPicMapper {
    public void insertUserPic(UserPic userPic);

    public UserPic selectUserPic(int id);
}
