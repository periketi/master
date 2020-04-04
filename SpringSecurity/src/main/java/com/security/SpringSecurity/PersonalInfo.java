package com.security.SpringSecurity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name="Personal_Details")
public class PersonalInfo {

    @Id
    @Column(name = "userId")
    private  Integer userId;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "dob")
    private Date dob;

    @OneToMany
    private Collection<AddressDetails> address = new ArrayList<AddressDetails>();

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }



    public Collection<AddressDetails> getAddress() {
        return address;
    }

    public void setAddress(Collection<AddressDetails> address) {
        this.address = address;
    }

}
