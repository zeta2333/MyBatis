package usts.pycro.mybatis.mapper;

import usts.pycro.mybatis.model.User;

import java.util.List;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-02 10:25 AM
 */
public interface UserMapper {
    /**
     * MyBatis面向接口编程的两个一致：
     * 1.mapper的namespace名与接口的全类名保持一致
     * 2.sql语句的id与接口中的方法名保持一致
     */
    /**
     * 添加用户信息
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    /**
     * 删除用户
     */
    void deleteUser();

    /**
     * 根据id查询用户
     */
    User getUserById();

    /**
     * 查询所有数据
     */
    List<User> getAllUser();
}
