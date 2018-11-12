package com.netcracker.edu.backend.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "user-data", schema = "eduproject")
public class UserData {
    private Long userId;
    private User user;

    private String username;
    private String clientLastName;
    private String clientFirstName;
    private Date clientDateBirthday;
    private Date registrationDate;

    public UserData() {
    }

    @Id
    @Column(name = "user_id", nullable = false)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
    @Column(name = "client_date_birthday")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserData userData = (UserData) o;
        return Objects.equals(userId, userData.userId) &&
                Objects.equals(username, userData.username) &&
                Objects.equals(clientLastName, userData.clientLastName) &&
                Objects.equals(clientFirstName, userData.clientFirstName) &&
                Objects.equals(clientDateBirthday, userData.clientDateBirthday) &&
                Objects.equals(registrationDate, userData.registrationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, username, clientLastName, clientFirstName, clientDateBirthday, registrationDate);
    }

    @Override
    public String toString() {
        return "UserData{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", clientLastName='" + clientLastName + '\'' +
                ", clientFirstName='" + clientFirstName + '\'' +
                ", clientDateBirthday=" + clientDateBirthday +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
