package usts.pycro.mybatis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-03 4:34 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {

    private Integer empId;

    private String empName;

    private Integer age;

    private Character gender;

    private String email;

    private Dept dept;
}
