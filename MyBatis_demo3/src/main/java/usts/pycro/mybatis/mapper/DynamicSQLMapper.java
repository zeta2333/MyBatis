package usts.pycro.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import usts.pycro.mybatis.model.Emp;

import java.util.List;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-04 3:09 PM
 */
public interface DynamicSQLMapper {
    /**
     * 多条件查询
     *
     * @param emp
     * @return
     */
    List<Emp> getEmpByCondition(Emp emp);

    /**
     * 测试choose、when、otherwise
     *
     * @param emp
     * @return
     */
    List<Emp> getEmpByChoose(Emp emp);

    void batchDeleteByArray(@Param("empIds") Integer[] empIds);

    void batchInsertByList(@Param("empList") List<Emp> empList);
}
