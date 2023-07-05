package usts.pycro.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import usts.pycro.mybatis.model.Emp;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-05 9:36 AM
 */
public interface CacheMapper {
    /**
     * 根据id获取emp
     *
     * @param empId
     * @return
     */
    Emp getEmpById(@Param("empId") Integer empId);

    /**
     * 添加emp
     * @param emp
     */
    void insertEmp(Emp emp);
}
