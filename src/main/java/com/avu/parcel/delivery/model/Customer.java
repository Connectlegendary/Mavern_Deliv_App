/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avu.parcel.delivery.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Avuyile
 */
@Entity
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String customerNumber;
    @Embedded
    private Name name;
    @Embedded
    private Contact contact;
    @Embedded
    private Gemographic gemographic; 
    @Embedded
    private CustomerAddress costumerAddress;
    @OneToMany
    @JoinColumn(name = "customerId")
    private List<Parcel> parcel;
    @OneToMany
    @JoinColumn(name = "customerId")
    private List<Employee> employee;

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    
    public List<Parcel> getParcel() {
        return parcel;
    }

    public void setParcel(List<Parcel> parcel) {
        this.parcel = parcel;
    }
    
    
    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Gemographic getGemographic() {
        return gemographic;
    }

    public void setGemographic(Gemographic gemographic) {
        this.gemographic = gemographic;
    }

    public CustomerAddress getCostumerAddress() {
        return costumerAddress;
    }

    public void setCostumerAddress(CustomerAddress costumerAddress) {
        this.costumerAddress = costumerAddress;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.avu.parcel.delivery.Customer[ id=" + id + " ]";
    }   
}