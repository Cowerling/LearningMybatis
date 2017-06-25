package com.cowerling.service;

import com.cowerling.domain.UserPic;
import com.cowerling.mapper.UserPicMapper;
import com.cowerling.util.DataSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by dell on 2017-6-23.
 */
public class UserPicService {
    public void createUserPic(UserPic userPic) {
        SqlSession sqlSession = DataSqlSessionFactory.getSqlSession();

        try {
            UserPicMapper userPicMapper = sqlSession.getMapper(UserPicMapper.class);
            userPicMapper.insertUserPic(userPic);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    public UserPic findUserPic(int id) {
        SqlSession sqlSession = DataSqlSessionFactory.getSqlSession();

        try {
            UserPicMapper userPicMapper = sqlSession.getMapper(UserPicMapper.class);
            return userPicMapper.selectUserPic(id);
        } finally {
            sqlSession.close();
        }
    }
}
