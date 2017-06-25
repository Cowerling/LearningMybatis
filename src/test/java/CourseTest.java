import com.cowerling.domain.Course;
import com.cowerling.service.CourseService;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by dell on 2017-6-23.
 */
public class CourseTest {
    private static CourseService courseService;

    @BeforeClass
    public static void setup() {
        courseService = new CourseService();
    }

    @AfterClass
    public static void teardown() {
        courseService = null;
    }

    @Test
    public void testSearchCourses() {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            //map.put("tutorId", 2);
            map.put("courseName", "%Java%");
            map.put("startDate", new SimpleDateFormat("yyyy-MM-dd").parse("2013-01-01"));

            List<Course> courses = courseService.searchCourses(map);
            assertNotNull(courses);

            for (Course course : courses) {
                System.out.println(course);
            }
        } catch (ParseException ex) {

        }
    }

    @Test
    public void testSingleSearchCourses() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tutorId", 2);
        map.put("courseName", "%Java%");

        List<Course> courses = courseService.singleSearchCourses(map);
        assertNotNull(courses);

        for (Course course : courses) {
            System.out.println(course);
        }
    }

    @Test
    public void testFindCoursesByTutor() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Integer> tutorIds = new ArrayList<Integer>();
        tutorIds.add(1);
        tutorIds.add(2);
        map.put("tutorIds", tutorIds);

        List<Course> courses = courseService.searchCoursesByTutors(map);
        assertNotNull(courses);

        for (Course course : courses) {
            System.out.println(course);
        }
    }
}
