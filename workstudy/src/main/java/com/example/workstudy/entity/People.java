package com.example.workstudy.entity;

import com.example.workstudy.jdk.MyAnnotation;

import java.io.Serializable;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class People implements Supplier, Consumer, Function, Predicate, Serializable {



    @MyAnnotation
    private String peopleName;

    private Integer age;

    private Integer salary;

    private String sex;

    private String area;

    private boolean enable;

    public People() {
    }

    /**
     *
     * @param peopleName
     * @param age
     * @param salary
     * @param sex
     * @param area
     */
    public People(String peopleName, Integer age, Integer salary, String sex, String area) {
        this.peopleName = peopleName;
        this.age = age;
        this.salary = salary;
        this.sex = sex;
        this.area = area;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(peopleName, people.peopleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peopleName);
    }

    @Override
    public String toString() {
        return "People{" +
                "peopleName='" + peopleName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", sex='" + sex + '\'' +
                ", area='" + area + '\'' +
                '}';
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    @Override
    public Object get() {
        return this.toString();
    }

    @Override
    public void accept(Object o) {

    }

    @Override
    public Object apply(Object o) {
        return null;
    }

    @Override
    public boolean test(Object o) {
        return false;
    }
}
