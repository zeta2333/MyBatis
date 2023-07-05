package usts.pycro.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-03 9:54 AM
 */
public class SqlSessionUtils {
    public static SqlSession getSqlSession(String context) {
        // 获取核心配置文件输入流
        try {
            InputStream is = Resources.getResourceAsStream(context);
            // 获取sqlSessionFactoryBuilder
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            // 获取sqlSessionFactory
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            // 获取sqlSession并开启自动事务
            return sqlSessionFactory.openSession(true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
