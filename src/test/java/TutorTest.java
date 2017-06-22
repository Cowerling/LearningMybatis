import com.cowerling.domain.Tutor;
import com.cowerling.service.TutorService;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

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
}
