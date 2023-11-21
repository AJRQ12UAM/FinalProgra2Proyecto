
package com.mycompany.proyectofinalprogra2.Clases;

public class User {
    private String name;
    private String lastname;
    private String userID;
    private String email;
    private String userType;
    private String address;
    private String telephone;
    private boolean alreadyLogged; 
    private String adminRole;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public boolean isAlreadyLogged() {
        return alreadyLogged;
    }

    public void setAlreadyLogged(boolean alreadyLogged) {
        this.alreadyLogged = alreadyLogged;
    }

    public String getAdminRole() {
        return adminRole;
    }

    public void setAdminRole(String adminRole) {
        this.adminRole = adminRole;
    }

    public User() {
    }

    public User(String name, String lastname, String userID, String email, String userType, String address, String telephone, boolean alreadyLogged, String adminRole) {
        this.name = name;
        this.lastname = lastname;
        this.userID = userID;
        this.email = email;
        this.userType = userType;
        this.address = address;
        this.telephone = telephone;
        this.alreadyLogged = alreadyLogged;
        this.adminRole = adminRole;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", lastname=" + lastname + ", userID=" + userID + ", email=" + email + ", userType=" + userType + ", address=" + address + ", telephone=" + telephone + ", alreadyLogged=" + alreadyLogged + ", adminRole=" + adminRole + '}';
    }
    
}




