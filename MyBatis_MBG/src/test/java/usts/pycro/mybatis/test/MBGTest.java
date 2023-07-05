package usts.pycro.mybatis.test;

import org.junit.Test;
import usts.pycro.mybatis.mapper.EmpMapper;
import usts.pycro.mybatis.model.Emp;
import usts.pycro.mybatis.model.EmpExample;
import usts.pycro.mybatis.utils.SqlSessionUtils;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-05 11:48 AM
 */
public class MBGTest {
    private EmpMapper empMapper = SqlSessionUtils
            .getSqlSession("mybatis-config.xml")
            .getMapper(EmpMapper.class);

    @Test
    public void testMBG() {
        EmpExample example = new EmpExample();
        // example.createCriteria().andEmpNameEqualTo("张三").andAgeGreaterThan(20);
        // example.or().andGenderEqualTo("女");
        // List<Emp> empList = empMapper.selectByExample(example);
        // empList.forEach(System.out::println);
        // empMapper.updateByPrimaryKey(new Emp(5, "田鸡", 26, null, "456@qq.com", 2));
        empMapper.updateByPrimaryKeySelective(new Emp(5, "田鸡", 26, null, "456@qq.com", 2));
    }
}
