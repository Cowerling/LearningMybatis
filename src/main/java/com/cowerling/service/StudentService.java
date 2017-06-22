package com.cowerling.service;

import com.cowerling.domain.Student;
import com.cowerling.mapper.StudentMapper;
import com.cowerling.util.DataSourceFactory;
import com.cowerling.util.DataSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by dell on 2017-6-14.
 */
public class StudentService {
    public List<Student> findAllStudents() {
        SqlSession sqlSession = DataSqlSessionFactory.getSqlSession();

        try {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            return studentMapper.findAllStudents();
        } finally {
            sqlSession.close();
        }
    }

    public Student findStudentById(Integer id) {
        SqlSession sqlSession = DataSqlSessionFactory.getSqlSession();

        try {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            return studentMapper.findStudentById(id);
        } finally {
            sqlSession.close();
        }
    }

    public void createStudent(Student student) {
        SqlSession sqlSession = DataSqlSessionFactory.getSqlSession();

        try {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            studentMapper.insertStudent(student);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    public void updateStudent(Student student) {
        SqlSession sqlSession = DataSqlSessionFactory.getSqlSession();

        try {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            studentMapper.updateStudent(student);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    public void removeStudent(Student student) {
        SqlSession sqlSession = DataSqlSessionFactory.getSqlSession();

        try {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            studentMapper.deleteStudent(student);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    public Student findStudentWithAddress(int id) {
        SqlSession sqlSession = DataSqlSessionFactory.getSqlSession();

        try {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            return studentMapper.findStudentWithAddress(id);
        } finally {
            sqlSession.close();
        }
    }
}
