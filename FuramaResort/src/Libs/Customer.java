package Libs;

import Models.Services;

public class Customer {
    private String nameCustomer;
    private String birthdayCustomer;
    private String sexual;
    private String cmnd;
    private int numberPhone;
    private String email;
    private String typesOfCustomer;
    private String address;
    private Services services;

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public Customer() {
    }

    public Customer(String nameCustomer, String birthdayCustomer, String sexual, String cmnd, int numberPhone, String email, String typesOfCustomer, String address) {
        this.nameCustomer = nameCustomer;
        this.birthdayCustomer = birthdayCustomer;
        this.sexual = sexual;
        this.cmnd = cmnd;
        this.numberPhone = numberPhone;
        this.email = email;
        this.typesOfCustomer = typesOfCustomer;
        this.address = address;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthdayCustomer() {
        return birthdayCustomer;
    }

    public void setBirthdayCustomer(String birthdayCustomer) {
        this.birthdayCustomer = birthdayCustomer;
    }

    public String getSexual() {
        return sexual;
    }

    public void setSexual(String sexual) {
        this.sexual = sexual;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypesOfCustomer() {
        return typesOfCustomer;
    }

    public void setTypesOfCustomer(String typesOfCustomer) {
        this.typesOfCustomer = typesOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nameCustomer='" + nameCustomer + '\'' +
                ", birthdayCustomer='" + birthdayCustomer + '\'' +
                ", sexual='" + sexual + '\'' +
                ", cmnd='" + cmnd + '\'' +
                ", numberPhone=" + numberPhone +
                ", email='" + email + '\'' +
                ", typesOfCustomer='" + typesOfCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
