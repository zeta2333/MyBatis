package usts.pycro.mybatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import usts.pycro.mybatis.mapper.UserMapper;
import usts.pycro.mybatis.model.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-02 10:48 AM
 */
public class MyBatisTest {
    @Test
    public void testMyBatis() throws IOException {
        // 加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 获取mapper接口对象（通过接口获取实现类的对象）
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 测试功能
        int res = mapper.insertUser();
        // 提交事务
        // sqlSession.commit();
        System.out.println("res = " + res);
    }

    @Test
    public void testCRUD() throws IOException {
        // 加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);// true开启自动提交事务
        // 获取mapper接口对象（通过接口获取实现类的对象）
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 测试功能
        // mapper.updateUser();
        // mapper.deleteUser();
        // User user = mapper.getUserById();
        // System.out.println("user = " + user);
        List<User> userList = mapper.getAllUser();
        userList.forEach(System.out::println);
    }
}
