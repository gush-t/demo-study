package com.example.demo03nacosprovider.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


public class BaseEntity implements Serializable {

    private Integer id;

    private Date createdTime;

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                ", createdTime=" + createdTime +
                '}';
    }

    public BaseEntity() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity that = (BaseEntity) o;
        return id.equals(that.id) && createdTime.equals(that.createdTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdTime);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
