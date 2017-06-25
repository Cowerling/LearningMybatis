package com.cowerling.mapper;

import com.cowerling.domain.Course;
import com.cowerling.domain.Tutor;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by dell on 2017-6-21.
 */
public interface TutorMapper {
    @Select("SELECT tutors.tutor_id, tutors.name, email, addresses.addr_id, street, city, state, zip, country, course_id, courses.name, description, start_date, end_date FROM tutors LEFT OUTER JOIN addresses ON tutors.addr_id=addresses.addr_id LEFT OUTER JOIN courses ON tutors.tutor_id=courses.tutor_id WHERE tutors.tutor_id=#{id}")
    @ResultMap("com.cowerling.mapper.TutorMapper.tutorResult")
    Tutor findTutorById(int id);

    List<Course> findCoursesByTutor(Tutor tutor);
}
