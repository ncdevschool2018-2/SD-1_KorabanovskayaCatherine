package com.netcracker.edu.backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "eduproject")
public class User {
    private Long userId;
    private String userLogin;
    private String userPassword;
    private Role role;
    private Company company;
//    private UserData userData;

    public User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_login", nullable = false, length = 45)
    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    @Basic
    @Column(name = "user_password", nullable = false, length = 45)
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    @JsonIgnore
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    @JsonIgnore
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

//    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
//    public UserData getUserData() {
//        return userData;
//    }
//
//    public void setUserData(UserData userData) {
//        this.userData = userData;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) &&
                Objects.equals(userLogin, user.userLogin) &&
                Objects.equals(userPassword, user.userPassword) &&
                Objects.equals(role, user.role) &&
                Objects.equals(company, user.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userLogin, userPassword, role, company);
    }

    //TODO: equals() and hashCode(), constructors

    //TODO: toString(), который бы частично скрывал информацию пользователя
}
