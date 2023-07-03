package usts.pycro.mybatis.mapper;

import usts.pycro.mybatis.model.Emp;

import java.util.List;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-03 4:37 PM
 */
public interface EmpMapper {
    List<Emp> listAllEmp();
}
