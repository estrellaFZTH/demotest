import com.demo.dao.UserMapper;
import com.demo.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dreamStar
 * @create 2020-04-08 3:12
 */
public class SpringDemo {

    @Test
    public void test1(){
        /**
         * 获取mapper对象执行业务方法
         */
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");
        // 单例还是多例？  单例
        // 它的生命周期和应用的生命周期是一样的
        // 有可能跨线程调用
        UserMapper userMapper = context.getBean(UserMapper.class);
        System.out.println(userMapper.findUserByUserName("xx"));
        System.out.println(userMapper.findUserById(1));

        // 以往的做法：它是多例的
        // 它是线程安全的
//        SqlSession sqlSession = null;
//        UserMapper userMapper2 = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = context.getBean(UserService.class);
        //没有事务的查询
        System.out.println(userService.getUser(1));
        //有事务的查询,第一次查询走sql语句，第二次查询就走缓存了
        System.out.println(userService.getUser2(1));
    }
}
