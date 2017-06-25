package com.cowerling.mapper;

import com.cowerling.domain.Student;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * Created by dell on 2017-6-13.
 */
public interface StudentMapper {
    @Select("SELECT * FROM students")
    @ResultMap("com.cowerling.mapper.StudentMapper.studentResult")
    List<Student> findAllStudents(RowBounds rowBounds);

    //@Select("SELECT * FROM student WHERE stud_id = #{id}")
    Student findStudentById(Integer id);

    @Insert("INSERT INTO students(name, email, phone, dob, gender_id) VALUES(#{name}, #{email}, #{phoneNumber}, #{birthday}, #{gender})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertStudent(Student student);

    //@Update("UPDATE students SET name=#{name}, email=#{email}, dob=#{birthday} WHERE stud_id=#{id}")
    int updateStudent(Student student);

    int deleteStudent(Student student);

    @Select("SELECT stud_id, name, email, phone, addresses.addr_id AS addr_id, street, city, state, zip, country FROM students LEFT OUTER JOIN addresses ON students.addr_id=addresses.addr_id WHERE students.stud_id=#{id}")
    @ResultMap("com.cowerling.mapper.StudentMapper.studentWithAddressResult")
    Student findStudentWithAddress(int id);
}
