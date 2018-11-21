package com.netcracker.edu.backend.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "account", schema = "eduproject")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "accountId")
public class Account {

    private Long accountId;
    private String username;
    private String lastName;
    private String firstName;
    private Date birthdayDate;
    private Date registrationDate;

    private User user;
    private Company company;

    public Account() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id", nullable = false)
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    @Column(name = "username", nullable = false, length = 45)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "last_name", nullable = false, length = 45)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "first_name", nullable = false, length = 45)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "birthday_date", nullable = true)
    public Date getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    @Column(name = "registration_date", nullable = false)
    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @OneToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn (name="user_id")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id")
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountId, account.accountId) &&
                Objects.equals(username, account.username) &&
                Objects.equals(lastName, account.lastName) &&
                Objects.equals(firstName, account.firstName) &&
                Objects.equals(birthdayDate, account.birthdayDate) &&
                Objects.equals(registrationDate, account.registrationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, username, lastName, firstName, birthdayDate, registrationDate);
    }
}
