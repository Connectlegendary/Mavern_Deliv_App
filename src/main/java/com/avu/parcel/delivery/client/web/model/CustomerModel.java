/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avu.parcel.delivery.client.web.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Avuyile
 */
public class CustomerModel implements Serializable {
    private Long id;
    private String customerNumber;
    private String firstName;
    private String lastName;
    private String cellNumber;
    private String phoneNumber;
    private String gender;
    private String race;
    private Date dateOfBirth;
    private String postalAddress;
    private String streetAddress;
    private String postalCode;
    
    private  Long dropListCustomer;
    private List<String> listCustomer;

    public Long getDropListCustomer() {
        return dropListCustomer;
    }

    public void setDropListCustomer(Long dropListCustomer) {
        this.dropListCustomer = dropListCustomer;
    }

    public List<String> getListCustomer() {
        return listCustomer;
    }

    public void setListCustomer(List<String> listCustomer) {
        this.listCustomer = listCustomer;
    }
    
    

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
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

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

  

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
}
