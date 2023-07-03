package usts.pycro.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import usts.pycro.mybatis.model.User;

import java.util.List;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-03 3:16 PM
 */
public interface SQLMapper {
    /**
     * 根据username模糊查询
     * @param username
     * @return
     */
    List<User> getUserByLike(@Param("username")String username);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int batchDelete(@Param("ids")String ids);

    /**
     * 根据表名查询数据
     * @param tableName
     * @return
     */
    List<User> getUserByTableName(@Param("tableName") String tableName);

    /**
     * 添加数据，并获取自动递增的主键
     * @param user
     */
    void insertUser(User user);
}
