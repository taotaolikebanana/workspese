package cn.kgc.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@ConfigurationProperties(prefix = "person")
@Component
public class Person {
    private String name;
    private Long age;
    private String sex;
    private String address;
    private String[] myAddress;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", myAddress=" + Arrays.toString(myAddress) +
                '}';
    }

    public String[] getMyAddress() {
        return myAddress;
    }

    public void setMyAddress(String[] myAddress) {
        this.myAddress = myAddress;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
