package com.echo.example.serialization;

import java.io.Serializable;
import java.util.Date;

/**
 * User类实现 Serializable 接口
 * 用于序列化及反序列化
 *
 * @author echo.guan
 * @date 2019/05/31
 */
public class User implements Serializable {

    private static final long serialVersionUID = -2244261743565271850L;

    private String name;
    private int age;
    private Date birthday;
    /**
     * transient value
     */
    private transient String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';
    }
}
