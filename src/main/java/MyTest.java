import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTest {
    @GetMapping("test")
    private void test(){
        System.out.println("This is my test class");
    }
}
