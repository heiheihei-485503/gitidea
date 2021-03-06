package com.explame.pojo;

//其他团队的代码
import java.util.Objects;

//第一版
//第2版
public class User {
    private Integer age;
    private String uname;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(age, user.age) && Objects.equals(uname, user.uname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, uname);
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", uname='" + uname + '\'' +
                '}';
    }
}
//23333333333333
