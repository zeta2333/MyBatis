package usts.pycro.mybatis.test;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import usts.pycro.mybatis.mapper.EmpMapper;
import usts.pycro.mybatis.model.Emp;
import usts.pycro.mybatis.utils.SqlSessionUtils;

import java.util.List;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-05 4:59 PM
 */
public class PageHelperTest {
    private EmpMapper empMapper = SqlSessionUtils
            .getSqlSession("mybatis-config.xml")
            .getMapper(EmpMapper.class);

    @Test
    public void testPage() {
        Page<Emp> page = PageHelper.startPage(6, 4);
        List<Emp> empList = empMapper.selectByExample(null);
        PageInfo<Emp> pageInfo = new PageInfo<>(empList, 5);
        System.out.println(pageInfo);
    }

    @Test
    public void test(){
        for (int i = 0; i < 50; i++) {
            Emp emp = new Emp();
            emp.setEmpName("a");
            empMapper.insert(emp);
        }

    }
}
