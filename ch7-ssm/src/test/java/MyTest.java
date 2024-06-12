import com.gj.domain.Book;
import com.gj.service.BookService;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application_dao.xml","classpath:application_service.xml"})
public class MyTest {

    private BookService service;
    public void test1(){
        Book book =service.selectBookById(1);
        System.out.println(book.getId()+"==="+book.getAuthor()+"==="+book.getPress()+"==="+book.getAuthor());
    }
}
