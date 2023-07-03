package usts.pycro.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import usts.pycro.mybatis.model.User;

import java.util.List;
import java.util.Map;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-03 9:43 AM
 */
public interface ParamMapper {
    // 验证登录（使用@Param,@Param指定参数存放的map集合中的key名）
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);

    // 添加用户
    void insertUser(User user);

    // 验证登录，参数为map
    User checkLoginByMap(Map<String, Object> map);

    // 验证登录
    User checkLogin(String username, String password);

    // 根据用户名查询用户信息
    User getUserByUsername(String username);

    // 查询所有用户信息
    List<User> listAllUser();
}
