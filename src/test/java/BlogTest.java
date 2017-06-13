import com.cowerling.config.DataConfigure;
import com.cowerling.dao.BlogMapper;
import com.cowerling.domain.Blog;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by dell on 2017-6-12.
 */
public class BlogTest {
    public static void main(String[] args) {
        SqlSession session = DataConfigure.getSessionFactory().openSession();

        try {
            BlogMapper mapper = session.getMapper(BlogMapper.class);

            Blog blog = mapper.selectBlog(101);
            System.out.println(blog.getName());

           /* mapper.insertBlog(102, "No.102");
            Blog blog2 = mapper.selectBlog(101);
            System.out.println(blog2.getId() + "-" + blog2.getName());*/
        } finally {
            session.close();
        }
    }
}
