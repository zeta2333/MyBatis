import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import usts.pycro.mybatis.mapper.CacheMapper;
import usts.pycro.mybatis.model.Emp;
import usts.pycro.mybatis.utils.SqlSessionUtils;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-05 9:39 AM
 */
public class CacheMapperTest {
    private CacheMapper mapper = SqlSessionUtils
            .getSqlSession("mybatis-config.xml")
            .getMapper(CacheMapper.class);

    @Test
    public void testGetEmpById() {
        Emp emp1 = mapper.getEmpById(1);
        System.out.println(emp1);
        // mapper.insertEmp(new Emp(null, "Rosalyn", 24, '女', "rsl@qq.com", null));
        // SqlSession.clearCache();手动清空缓存
        Emp emp2 = mapper.getEmpById(1);
        System.out.println(emp2);
    }

    @Test
    public void test() {
        SqlSession sqlSession = SqlSessionUtils
                .getSqlSession("mybatis-config.xml");

    }
}
