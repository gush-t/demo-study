package com.example.jdktest.entity;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {

    private Integer id;

    private String stuName;

    private String stuClass;

    private String stuSchool;

    public Student() {
    }

    public Student(Integer id, String stuName, String stuClass, String stuSchool) {
        this.id = id;
        this.stuName = stuName;
        this.stuClass = stuClass;
        this.stuSchool = stuSchool;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", stuClass='" + stuClass + '\'' +
                ", stuSchool='" + stuSchool + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(stuName, student.stuName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stuName);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    public String getStuSchool() {
        return stuSchool;
    }

    public void setStuSchool(String stuSchool) {
        this.stuSchool = stuSchool;
    }
}
