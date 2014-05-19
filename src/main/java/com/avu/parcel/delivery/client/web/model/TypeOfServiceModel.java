/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avu.parcel.delivery.client.web.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Avuyile
 */
public class TypeOfServiceModel implements Serializable{
    
    private Long id;
    private String serviceNumber;
    private BigDecimal costPerKilo;
    private String serviceType;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(String serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public BigDecimal getCostPerKilo() {
        return costPerKilo;
    }

    public void setCostPerKilo(BigDecimal costPerKilo) {
        this.costPerKilo = costPerKilo;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
    
    
    
}