package usts.pycro.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import usts.pycro.mybatis.mapper.ParamMapper;
import usts.pycro.mybatis.model.User;
import usts.pycro.mybatis.utils.SqlSessionUtils;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-03 9:48 AM
 */
public class ParamMapperTest {
    /**
     * MyBatis获取参数值的两种方式：${}和#{}
     * ${}：本质是字符串拼接
     * #{}：本质是占位符赋值
     * MyBatis获取参数值的各种情况：
     * 1.方法参数为单个字面量类型
     * 可以通过${}和#{}以任意的字符串获取参数值，但是需要注意${}的单引号问题
     * 2.mapper接口方法的参数为多个时
     * 此时MyBatis会将这些参数放在一个map集合中，以两种方式进行存储
     * a>以arg0, arg1...为键，以参数为值
     * b>以param1 , param2...为键，以参数为值
     * 因此只需要通过#{}和${}以键的方式访问值即可，但是需要注意${}的单引号问题
     * 3.若mapper接口方法的参数有多个时，可以手动将这些参数放在一个map中存储
     * 只需要通过#{}和${}以键的方式访问值即可，但是需要注意${}的单引号问题
     * 4. mapper接口方法的参数是实体类类型的参数
     * 只需要通过#{}和${}以属性的方式访问属性值即可，但是需要注意${}的单引号问题
     * 5.使用@Param注解命名参数
     * 此时MyBatis会将这些参数放在一个map集合中，以两种方式进行存储
     * a>以@Param注解的值为键，以参数为值
     * b>以param1 , param2...为键，以参数为值
     * 因此只需要通过#{}和${}以键的方式访问值即可，但是需要注意${}的单引号问题
     */
    @Test
    public void testList() {
        // 获取sqlSession
        SqlSession sqlSession = SqlSessionUtils.getSqlSession("mybatis-config.xml");
        // 获取mapper接口对应实现类的对象
        ParamMapper mapper = sqlSession.getMapper(ParamMapper.class);
        // 调用方法
        // List<User> userList = mapper.listAllUser();
        // userList.forEach(System.out::println);
        // User user = mapper.getUserByUsername("admin");
        // System.out.println("user = " + user);
        // User user = mapper.checkLogin("张三", "123456");
        // Map<String, Object> map = new HashMap<>();
        // map.put("username", "张三");
        // map.put("password", "123456");
        // User user = mapper.checkLoginByMap(map);
        // User user = mapper.checkLoginByParam("李四", "123456");
        // System.out.println("user = " + user);
    }

    @Test
    public void testInsert() {
        // 获取sqlSession
        SqlSession sqlSession = SqlSessionUtils.getSqlSession("mybatis-config.xml");
        // 获取mapper接口对应实现类的对象
        ParamMapper mapper = sqlSession.getMapper(ParamMapper.class);
        User user = new User(null, "李四", "123456", 32, "男", "123@163.com");
        mapper.insertUser(user);
    }

    @Test
    public void test() {
        System.out.println("Java™");
    }
}
