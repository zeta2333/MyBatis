package usts.pycro.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import usts.pycro.mybatis.model.Dept;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-03 4:37 PM
 */
public interface DeptMapper {

    /**
     * 分布查询第二步
     *
     * @param deptId
     * @return
     */
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);

    /**
     * 查询部门信息及其所有员工信息
     *
     * @param deptId
     * @return
     */
    Dept getDeptAndEmp(@Param("deptId") Integer deptId);

    /**
     * 查询部分及员工信息分布查询第一步
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);
}
