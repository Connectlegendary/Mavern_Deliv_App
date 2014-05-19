/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avu.parcel.delivery.client.web.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Avuyile
 */
public class ParcelModel implements Serializable 
{
    private Long id;
    private Date depDate;
    private Date arrDate;
    private int weight;
    private BigDecimal cost;
    private  Long dropListService;
    private  Long dropListCustomer;
    
    private  Long dropListDestination;

    public Long getDropListDestination() {
        return dropListDestination;
    }

    public void setDropListDestination(Long dropListDestination) {
        this.dropListDestination = dropListDestination;
    }
    
    
    
   
    private String streetAddress;

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    
    
    
    
    
    public Long getDropListService() {
        return dropListService;
    }

    public void setDropListService(Long dropListService) {
        this.dropListService = dropListService;
    }
    
    
    
    
    public Long getDropListCustomer() {
        return dropListCustomer;
    }

    public void setDropListCustomer(Long dropListCustomer) {
        this.dropListCustomer = dropListCustomer;
    }

 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDepDate() {
        return depDate;
    }

    public void setDepDate(Date depDate) {
        this.depDate = depDate;
    }

    public Date getArrDate() {
        return arrDate;
    }

    public void setArrDate(Date arrDate) {
        this.arrDate = arrDate;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
    
    
    
    
}