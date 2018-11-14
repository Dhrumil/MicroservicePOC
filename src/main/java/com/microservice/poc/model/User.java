package com.microservice.poc.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.microservice.poc.utility.CustomDateSerializer;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class User extends AbstractModel implements Serializable {


    //@JsonIgnore
    private Long id;
    private String username;
    private String email;
    @JsonIgnore
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private int status;
    private boolean loginStatus;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Timestamp lastLogin;
    private Boolean passwordExpired = Boolean.FALSE;
    private int passwordExpirationDaysRemaining;
    private Date lockedDate;
    private Long loginAttempts;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Timestamp failedLoginDate;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Timestamp accountCreatedOn;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Timestamp passwordChangedOn;
    private String category;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Timestamp createdOn;
    private Long createdBy;
    private String creator;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Timestamp lastUpdatedOn;
    private Long lastUpdatedBy;
    private String updatedBy;
    private String activationCode;
    private Long maker;
    private String makedBy;
    private Long checker;
    private String checkedBy;
    private int approved;
    private Long roleId;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    public Timestamp getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Boolean getPasswordExpired() {
        return passwordExpired;
    }

    public void setPasswordExpired(Boolean passwordExpired) {
        this.passwordExpired = passwordExpired;
    }

    public int getPasswordExpirationDaysRemaining() {
        return passwordExpirationDaysRemaining;
    }

    public void setPasswordExpirationDaysRemaining(int passwordExpirationDaysRemaining) {
        this.passwordExpirationDaysRemaining = passwordExpirationDaysRemaining;
    }

    public Date getLockedDate() {
        return lockedDate;
    }

    public void setLockedDate(Date lockedDate) {
        this.lockedDate = lockedDate;
    }

    public Long getLoginAttempts() {
        return loginAttempts;
    }

    public void setLoginAttempts(Long loginAttempts) {
        this.loginAttempts = loginAttempts;
    }

    public Timestamp getFailedLoginDate() {
        return failedLoginDate;
    }

    public void setFailedLoginDate(Timestamp failedLoginDate) {
        this.failedLoginDate = failedLoginDate;
    }

    public Timestamp getAccountCreatedOn() {
        return accountCreatedOn;
    }

    public void setAccountCreatedOn(Timestamp accountCreatedOn) {
        this.accountCreatedOn = accountCreatedOn;
    }

    public Timestamp getPasswordChangedOn() {
        return passwordChangedOn;
    }

    public void setPasswordChangedOn(Timestamp passwordChangedOn) {
        this.passwordChangedOn = passwordChangedOn;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Timestamp getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public Long getMaker() {
        return maker;
    }

    public void setMaker(Long maker) {
        this.maker = maker;
    }

    public String getMakedBy() {
        return makedBy;
    }

    public void setMakedBy(String makedBy) {
        this.makedBy = makedBy;
    }

    public Long getChecker() {
        return checker;
    }

    public void setChecker(Long checker) {
        this.checker = checker;
    }

    public String getCheckedBy() {
        return checkedBy;
    }

    public void setCheckedBy(String checkedBy) {
        this.checkedBy = checkedBy;
    }

    public int getApproved() {
        return approved;
    }

    public void setApproved(int approved) {
        this.approved = approved;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "User {"
                + "\"id\":" + "\"" + getId()
                + "\",\"email\":" + "\"" + getEmail()
                + "\", \"firstName\":" + getFirstName()
                + "\", \"lastName\":" + getLastName()
                + "\", \"phoneNumber\":" + getPhoneNumber() + "}";
    }


    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }


}
