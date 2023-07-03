package usts.pycro.mybatis.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-03 4:34 PM
 */
@Data
@AllArgsConstructor
public class Emp {

    private Integer empId;

    private String empName;

    private Integer age;

    private Character gender;

    private String email;

    private Integer deptId;
}
