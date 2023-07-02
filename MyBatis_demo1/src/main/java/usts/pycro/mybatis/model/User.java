package usts.pycro.mybatis.model;

import lombok.Data;

/**
 * @author Pycro
 * @version 1.0
 * 2023-07-02 10:22 AM
 */
@Data
public class User {

    private Integer id;

    private String username;

    private String password;

    private Integer age;

    private String sex;

    private String email;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
