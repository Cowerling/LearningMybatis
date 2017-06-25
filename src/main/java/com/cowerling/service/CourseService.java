package com.cowerling.service;

import com.cowerling.domain.Course;
import com.cowerling.mapper.CourseMapper;
import com.cowerling.util.DataSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

/**
 * Created by dell on 2017-6-23.
 */
public class CourseService {
    public List<Course> searchCourses(Map<String, Object> map) {
        SqlSession sqlSession = DataSqlSessionFactory.getSqlSession();

        try {
            CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
            return courseMapper.searchCourses(map);
        } finally {
            sqlSession.close();
        }
    }

    public List<Course> singleSearchCourses(Map<String, Object> map) {
        SqlSession sqlSession = DataSqlSessionFactory.getSqlSession();

        try {
            CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
            return courseMapper.singleSearchCourses(map);
        } finally {
            sqlSession.close();
        }
    }

    public List<Course> searchCoursesByTutors(Map<String, Object> map) {
        SqlSession sqlSession = DataSqlSessionFactory.getSqlSession();

        try {
            CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
            return courseMapper.searchCoursesByTutors(map);
        } finally {
            sqlSession.close();
        }
    }
}
