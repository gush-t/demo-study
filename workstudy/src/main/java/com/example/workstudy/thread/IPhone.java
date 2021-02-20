package com.example.workstudy.thread;

public class IPhone {

    private int id;

    private String name;

    public IPhone(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public IPhone() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
