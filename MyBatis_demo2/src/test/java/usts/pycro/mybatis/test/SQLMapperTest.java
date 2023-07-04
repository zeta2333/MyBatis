package usts.pycro.mybatis.test;

import org.junit.Test;
import usts.pycro.mybatis.mapper.SQLMapper;
import usts.pycro.mybatis.model.User;
import usts.pycro.mybatis.utils.SqlSessionUtils;

import java.util.List;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-03 3:23 PM
 */
public class SQLMapperTest {
    private SQLMapper mapper = SqlSessionUtils.getSqlSession("mybatis-config.xml").getMapper(SQLMapper.class);

    @Test
    public void testGetUserByLike() {
        List<User> userList = mapper.getUserByLike("a");
        userList.forEach(System.out::println);
    }

    @Test
    public void testBatchDelete() {
        int row = mapper.batchDelete("3,4,7");
        System.out.println(row);
    }

    @Test
    public void testGetUserByTableName() {
        List<User> userList = mapper.getUserByTableName("t_user");
        userList.forEach(System.out::println);
    }

    @Test
    public void testInsertUser() {
        User user = new User(null, "Pycro", "111111", 22, "男", "233@qq.com");
        System.out.println(user);
        mapper.insertUser(user);
        System.out.println(user);
    }

    @Test
    public void test() {
        String res = String.join(",", "1", "2");
        System.out.println(res);
    }
}
