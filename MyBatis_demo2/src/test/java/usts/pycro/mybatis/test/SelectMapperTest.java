package usts.pycro.mybatis.test;

import org.junit.Test;
import usts.pycro.mybatis.mapper.SelectMapper;
import usts.pycro.mybatis.model.User;
import usts.pycro.mybatis.utils.SqlSessionUtils;

import java.util.List;
import java.util.Map;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-03 1:37 PM
 */
public class SelectMapperTest {
    /**
     * MyBatis的各种查询功能:
     * 1.若查询出的数据只有一条：
     * >a 可以通过实体类接收
     * >b 可以通过集合对象接收
     * >c 可以通过map对象接收
     * 结果：{password=123456, sex=男, id=3, age=23, email=123456@qq.com, username=admin}
     * 2.若查询出的数据有多条：
     * >a 可以通过实体类型的list集合接收
     * >b 可以通过map类型的list集合接收
     * 注意：一定不能通过实体类对象接收，此时会抛异常TooManyResultsException
     */

    private SelectMapper mapper = SqlSessionUtils
            .getSqlSession("mybatis-config.xml")
            .getMapper(SelectMapper.class);


    @Test
    public void testGetById() {
        User user = mapper.getUserById(6);
        System.out.println("user = " + user);
    }

    @Test
    public void testListAllUser() {
        List<User> userList = mapper.listAllUser();
        userList.forEach(System.out::println);
    }

    @Test
    public void testCount() {
        Integer count = mapper.countAllUser();
        System.out.println("count = " + count);
    }

    @Test
    public void testGetUserByIdToMap() {
        Map<String, Object> user = mapper.getUserByIdToMap(3);
        System.out.println(user);
    }

    @Test
    public void testListAllToMap() {
        Map<String, Object> userListMap = mapper.listAllUserToMap();
        System.out.println(userListMap);
    }
}
