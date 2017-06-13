package com.cowerling.mapper;

import com.cowerling.domain.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by dell on 2017-6-13.
 */
public interface StudentMapper {
    @Select("SELECT * FROM students")
    List<Student> findAllStudents();

    @Select("SELECT * FROM student WHERE stud_id = #{id}")
    Student findStudentById(Integer id);

    @Insert("INSERT INTO students VALUES(#{id}, #{name}, #{email}, #{birthday})")
    void insertStudent(Student student);


    void updateStudent(Student student);
}