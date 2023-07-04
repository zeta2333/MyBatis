package usts.pycro.mybatis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-03 4:35 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept {

    private Integer deptId;

    private String deptName;

    private List<Emp> emps;
}
