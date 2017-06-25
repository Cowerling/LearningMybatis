import com.cowerling.domain.Gender;
import com.cowerling.domain.PhoneNumber;
import com.cowerling.domain.Student;
import com.cowerling.service.StudentService;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by dell on 2017-6-15.
 */
public class StudentTest {
    private static StudentService studentService;

    @BeforeClass
    public static void setup() {
        studentService = new StudentService();
    }

    @AfterClass
    public static void teardown() {
        studentService = null;
    }

    @Test
    public void testFindAllStudents() {
        List<Student> students = studentService.findAllStudents();
        assertNotNull(students);

        for (Student student : students) {
            assertNotNull(student);
            System.out.println(student);
        }
    }

    @Test
    public void testFindStudentById() {
        Student student = studentService.findStudentById(1);
        assertNotNull(student);
        System.out.println(student);
    }

    @Test
    public void testCreateStudent() {
        /*try {
            Student student = new Student("Alimama", "alimama@gmail.com", new SimpleDateFormat("yyyy-MM-dd").parse("1988-01-21"));
            student.setGender(Gender.FEMAIL);

            studentService.createStudent(student);

            System.out.println(student);
        } catch (ParseException ex) {

        }*/
    }

    @Test
    public void testUpdateStudent() {
        try {
            Student student = new Student(9, "Breccan", "breccan@gmail.com", new SimpleDateFormat("yyyy-MM-dd").parse("1990-01-23"));
            student.setPhoneNumber(new PhoneNumber("212-081-352222"));

            studentService.updateStudent(student);

            System.out.println(student);
        } catch (ParseException ex) {

        }
    }

    @Test
    public void testRemoveStudent() {
        Student student = new Student();
        student.setId(11);

        studentService.removeStudent(student);
    }

    @Test
    public void testFindStudentWithAddress() {
        Student student = studentService.findStudentWithAddress(9);
        assertNotNull(student);
        System.out.println(student + " " + student.getAddress());
    }
}
