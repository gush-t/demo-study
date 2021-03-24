package generator.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * null
 * @TableName user
 */
public class User implements Serializable {
    /**
     * �û����
     */
    private Integer id;

    /**
     * �˺�
     */
    private String username;

    /**
     * ����
     */
    private String password;

    /**
     * ����ʱ��
     */
    private Date createdTime;

    /**
     * �Ƿ�ɾ����0-δɾ����1-ɾ��
     */
    private Boolean deleted;

    private static final long serialVersionUID = 1L;

    /**
     * �û����
     */
    public Integer getId() {
        return id;
    }

    /**
     * �û����
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * �˺�
     */
    public String getUsername() {
        return username;
    }

    /**
     * �˺�
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * ����
     */
    public String getPassword() {
        return password;
    }

    /**
     * ����
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * ����ʱ��
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * ����ʱ��
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * �Ƿ�ɾ����0-δɾ����1-ɾ��
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * �Ƿ�ɾ����0-δɾ����1-ɾ��
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", deleted=").append(deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}