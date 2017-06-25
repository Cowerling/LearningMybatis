package com.cowerling.mapper;

import com.cowerling.domain.Course;

import java.util.List;
import java.util.Map;

/**
 * Created by dell on 2017-6-23.
 */
public interface CourseMapper {
    List<Course> searchCourses(Map<String, Object> map);

    List<Course> singleSearchCourses(Map<String, Object> map);

    List<Course> searchCoursesByTutors(Map<String, Object> map);
}
