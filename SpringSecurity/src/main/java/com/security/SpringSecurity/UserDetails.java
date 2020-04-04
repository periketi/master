package com.security.SpringSecurity;

import javax.persistence.*;

@Entity
@Table(name = "User_Details")
public class UserDetails {


    @Id
    @Column(name = "userId")
    private Integer userId;
    @Column(name = "userName")
    private String userName;

    @OneToOne
    @JoinColumn(name = "PersonalInfo.userId")
    private PersonalInfo personalInfo;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }
}
