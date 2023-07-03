package usts.pycro.mybatis.mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import usts.pycro.mybatis.model.User;

import java.util.List;
import java.util.Map;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-03 1:33 PM
 */
public interface SelectMapper {
    /**
     * 根据id查询用户
     */
    User getUserById(@Param("id") int id);

    /**
     * 查询所有的用户
     */
    List<User> listAllUser();

    /**
     * 查询用户信息的总记录数
     */
    Integer countAllUser();

    /**
     * 根据id查询，返回map类型
     */
    @MapKey("id")
    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * 查询所有，返回map类型
     */
    @MapKey("id")
    Map<String, Object> listAllUserToMap();
}
