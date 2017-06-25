import com.cowerling.domain.Course;
import com.cowerling.domain.Tutor;
import com.cowerling.service.TutorService;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by dell on 2017-6-22.
 */
public class TutorTest {
    private static TutorService tutorService;

    @BeforeClass
    public static void setup() {
        tutorService = new TutorService();
    }

    @AfterClass
    public static void teardown() {
        tutorService = null;
    }

    @Test
    public void testFindTutorById() {
        Tutor tutor = tutorService.findTutorById(2);
        assertNotNull(tutor);
    }

    @Test
    public void testFindCoursesByTutor() {
        Tutor tutor = tutorService.findTutorById(2);
        List<Course> courses = tutorService.findCoursesByTutor(tutor);
        assertNotNull(courses);

        for (Course course : courses) {
            System.out.println(course);
        }
    }
}
