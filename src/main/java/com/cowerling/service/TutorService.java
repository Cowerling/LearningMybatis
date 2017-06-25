package com.cowerling.service;

import com.cowerling.domain.Course;
import com.cowerling.domain.Tutor;
import com.cowerling.mapper.TutorMapper;
import com.cowerling.util.DataSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

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

    public List<Course> findCoursesByTutor(Tutor tutor) {
        SqlSession sqlSession = DataSqlSessionFactory.getSqlSession();

        try {
            TutorMapper tutorMapper = sqlSession.getMapper(TutorMapper.class);
            return tutorMapper.findCoursesByTutor(tutor);
        } finally {
            sqlSession.close();
        }
    }
}
