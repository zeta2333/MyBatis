package usts.pycro.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import usts.pycro.mybatis.model.Emp;

import java.util.List;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-03 4:37 PM
 */
public interface EmpMapper {
    /**
     * 查询所有员工信息
     *
     * @return
     */
    List<Emp> listAllEmp();

    /**
     * 查询员工及对应的部门id
     *
     * @param empId
     * @return
     */
    Emp getEmpAndDept(@Param("empId") Integer empId);

    Emp getEmpAndDeptByStepOne(@Param("empId") Integer empId);

    /**
     * 分布查询第二步
     * @param deptId
     * @return
     */
    List<Emp> getDeptAndEmpByStepTwo(@Param("deptId") Integer deptId);
}
