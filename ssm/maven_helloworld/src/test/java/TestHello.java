import com.atguigu.Hello;
import org.junit.Test;

public class TestHello {

    @Test
    public void testHello(){
        Hello hello = new Hello();
        String maven = hello.sayHello("Maven");
        System.out.println(maven);
    }

}
