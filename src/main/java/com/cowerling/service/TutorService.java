package com.cowerling.service;

import com.cowerling.domain.Tutor;
import com.cowerling.mapper.TutorMapper;
import com.cowerling.util.DataSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by dell on 2017-6-22.
 */
public class TutorService {
    public Tutor findTutorById(int id) {
        SqlSession sqlSession = DataSqlSessionFactory.getSqlSession();

        try {
            TutorMapper tutorMapper = sqlSession.getMapper(TutorMapper.class);
            return tutorMapper.findTutorById(id);
        } finally {
            sqlSession.close();
        }
    }
}
