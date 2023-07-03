import org.junit.Test;
import usts.pycro.mybatis.mapper.EmpMapper;
import usts.pycro.mybatis.model.Emp;
import usts.pycro.mybatis.utils.SqlSessionUtils;

import java.util.List;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-03 4:52 PM
 */
public class EmpMapperTest {
    /**
     * 解决字段名和属性名不一致的情况：
     * a> 为字段起别名，保持和属性名一致
     * b> 设置全局配置，将下划线自动映射为驼峰
     * <setting name="mapUnderscoreToCamelCase" value="true"/>
     */
    private EmpMapper mapper = SqlSessionUtils
            .getSqlSession("mybatis-config.xml")
            .getMapper(EmpMapper.class);

    @Test
    public void test() {
        List<Emp> emps = mapper.listAllEmp();
        emps.forEach(System.out::println);
    }
}
