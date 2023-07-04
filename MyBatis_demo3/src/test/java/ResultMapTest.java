import org.junit.Test;
import usts.pycro.mybatis.mapper.DeptMapper;
import usts.pycro.mybatis.mapper.EmpMapper;
import usts.pycro.mybatis.model.Dept;
import usts.pycro.mybatis.model.Emp;
import usts.pycro.mybatis.utils.SqlSessionUtils;

import java.util.List;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-03 4:52 PM
 */
public class ResultMapTest {
    /**
     * 解决字段名和属性名不一致的情况：
     * a> 为字段起别名，保持和属性名一致
     * b> 设置全局配置，将下划线自动映射为驼峰
     * <setting name="mapUnderscoreToCamelCase" value="true"/>
     * c> 通过resultMap设置自定义的映射关系
     * <resultMap id="empResMap" type="emp">
     * <id property="empId" column="emp_id"/>
     * <result property="empName" column="emp_name"/>
     * <result property="age" column="age"/>
     * <result property="gender" column="gender"/>
     * <result property="email" column="email"/>
     * <result property="deptId" column="dept_id"/>
     * </resultMap>
     */
    private EmpMapper empMapper = SqlSessionUtils
            .getSqlSession("mybatis-config.xml")
            .getMapper(EmpMapper.class);
    private DeptMapper deptMapper = SqlSessionUtils
            .getSqlSession("mybatis-config.xml")
            .getMapper(DeptMapper.class);

    @Test
    public void testList() {
        List<Emp> emps = empMapper.listAllEmp();
        emps.forEach(System.out::println);
    }

    @Test
    public void testGetEmpAndDept() {
        Emp emp = empMapper.getEmpAndDept(2);
        System.out.println(emp);
    }

    @Test
    public void testGetEmpAndDeptByStep() {
        Emp emp = empMapper.getEmpAndDeptByStepOne(4);
        System.out.println(emp.getEmpName());
        System.out.println("-----------------------");
        System.out.println(emp.getDept().getDeptName());
    }

    @Test
    public void testDeptAndEmp() {
        // Dept dept = deptMapper.getDeptAndEmp(1);
        // System.out.println(dept);
        Dept dept = deptMapper.getDeptAndEmpByStepOne(1);
        System.out.println(dept.getDeptName());
        System.out.println(dept.getEmps());
    }
}