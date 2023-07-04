import org.junit.Test;
import usts.pycro.mybatis.mapper.DynamicSQLMapper;
import usts.pycro.mybatis.model.Emp;
import usts.pycro.mybatis.utils.SqlSessionUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-04 3:18 PM
 */
public class DynamicSQLTest {
    /**
     * 动态SQL：
     * 1.if：根据标签中的test属性所对应的表达式决定标签中的内容是否需要拼接到SQL中
     * 2.where：
     * 当where标签中有内容时，会自动生成where关键字，并将内容前多余的and或or去掉
     * 当where标签中没有内容时，此时where标签没有任何效果
     * 注意：where不能将内容后多余的and或or去掉
     * 3.trim：
     * prefix|suffix：将trim标签中内容前面或后面添加指定内容
     * prefixOverrides|suffixOverrides：将trim标签中内容前面或后面去掉指定内容
     * 若标签中没有内容时，trim标签也没有任何效果
     * 4.choose、when、otherwise，相当于switch、case、default
     * 5.foreach
     * collection:设置需要循环的数组或集合
     * item:表示数组或集合中的每一个数据
     * separator:循环体之间的分隔符
     * open:foreach标签所有内容的开始符
     * close:foreach标签所有内容的结束符
     * 6.sql标签
     * 设置sql片段：<sql id="empColumns"> emp_id,emp_name,age,gender,email,dept_id </sql>
     * 引用sql片段：<include refid="empColumns"/>
     */
    private DynamicSQLMapper mapper = SqlSessionUtils
            .getSqlSession("mybatis-config.xml")
            .getMapper(DynamicSQLMapper.class);

    @Test
    public void testGetByCondition() {
        List<Emp> empList = mapper.getEmpByCondition(
                new Emp(null, "", 23, '\u0000', "", null)
        );
        empList.forEach(System.out::println);
    }

    @Test
    public void testGetByChoose() {
        List<Emp> empList = mapper.getEmpByChoose(
                new Emp(null, "", 22, '\u0000', "", null)
        );
        empList.forEach(System.out::println);
    }

    @Test
    public void testBatchDeleteByArray() {
        mapper.batchDeleteByArray(new Integer[]{6, 7, 8});
    }

    @Test
    public void testBatchInsertByList() {
        Emp emp1 = new Emp(null, "a", 23, '男', "123@qq.com", null);
        Emp emp2 = new Emp(null, "b", 24, '女', "123@qq.com", null);
        Emp emp3 = new Emp(null, "c", 25, '男', "123@qq.com", null);
        List<Emp> empList = Arrays.asList(emp1, emp2, emp3);
        mapper.batchInsertByList(empList);
    }
}
