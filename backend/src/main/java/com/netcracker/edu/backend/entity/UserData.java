package com.netcracker.edu.backend.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "user-data", schema = "eduproject")
public class UserData {
    private long userId;
    private String username;
    private String clientLastName;
    private String clientFirstName;
    private Date clientDateBirthday;
    private Date registrationDate;

    @Id
    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 45)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "client_last_name", nullable = false, length = 45)
    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    @Basic
    @Column(name = "client_first_name", nullable = false, length = 45)
    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    @Basic
    @Column(name = "client_date_birthday", nullable = true)
    public Date getClientDateBirthday() {
        return clientDateBirthday;
    }

    public void setClientDateBirthday(Date clientDateBirthday) {
        this.clientDateBirthday = clientDateBirthday;
    }

    @Basic
    @Column(name = "registration_date", nullable = false)
    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

}
