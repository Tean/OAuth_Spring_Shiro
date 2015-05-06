import com.netteans.libs.redis.RedisClient;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Kings on 2015/5/7.
 */
public class Test {

    @org.junit.Test
    public void test() {
        System.out.println(new ClassPathXmlApplicationContext().getBean("StringRedisConnectionBean"));
        new RedisClient().get("x");
    }
}
