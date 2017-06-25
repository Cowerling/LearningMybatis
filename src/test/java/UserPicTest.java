import com.cowerling.domain.UserPic;
import com.cowerling.service.UserPicService;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

/**
 * Created by dell on 2017-6-23.
 */
public class UserPicTest {
    private static UserPicService userPicService;

    @BeforeClass
    public static void setup() {
        userPicService = new UserPicService();
    }

    @AfterClass
    public static void teardown() {
        userPicService = null;
    }

    @Test
    public void testCreateUserPic() {
        /*byte[] picture = null;

        try {
            File file = new File("C:\\Users\\dell\\Pictures\\c316a2dcjw1f31tv1ycg1j20c80lmjsf.jpg");
            InputStream inputStream = new FileInputStream(file);
            picture = new byte[inputStream.available()];
            inputStream.read(picture);
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        UserPic userPic = new UserPic("1", picture, "put some lengthy bio here");
        userPicService.createUserPic(userPic);*/
    }

    @Test
    public void testFindUserPic() {
        UserPic userPic = userPicService.findUserPic(6);
        assertNotNull(userPic);
    }
}
