package com.project.rain.entity;

/**
 * @Author Rain
 * @Date 2019/5/27
 * @Time 8:34
 * @Modified by
 **/
public class User {
    private Integer id;
    private String userCode;
    private String userName;
    private String createTime;
    private Integer deleteStatus;
    private Integer locked;
    private String telephone;
    private String updateTime;
    private String passWord;

    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", userCode='" + userCode + '\'' +
                ", createTime='" + createTime + '\'' +
                ", deleteStatus='" + deleteStatus + '\'' +
                ", locked='" + locked + '\'' +
                ", telephone='" + telephone + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
