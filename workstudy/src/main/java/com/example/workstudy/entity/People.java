package com.example.workstudy.entity;

import java.util.Objects;
import java.util.function.Supplier;

public class People implements Supplier {

    private String peopleName;

    private Integer age;

    private Integer salary;

    private String sex;

    private String area;

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

    @Override
    public Object get() {
        return this.toString();
    }
}
