package com.netcracker.edu.backend.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.netcracker.edu.backend.entity.enums.Role;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user", schema = "eduproject")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "userId")
public class User {

    private Long userId;
    private String login;
    private String password;
    private Role role;
//    private Set<BillingAccount> billingAccounts;
    private Account account;

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

    @Column(name = "user_login", nullable = false, length = 45)
    public String getLogin() {
        return login;
    }

    public void setLogin(String userLogin) {
        this.login = userLogin;
    }

    @Column(name = "user_password", nullable = false, length = 45)
    public String getPassword() {
        return password;
    }

    public void setPassword(String userPassword) {
        this.password = userPassword;
    }

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "user_role", nullable = false)
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

//    @OneToMany(fetch = FetchType.EAGER)
//    public Set<BillingAccount> getBillingAccounts() {
//        return billingAccounts;
//    }
//
//    public void setBillingAccounts(Set<BillingAccount> billingAccounts) {
//        this.billingAccounts = billingAccounts;
//    }


    @OneToOne (optional=false, mappedBy="user")
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

