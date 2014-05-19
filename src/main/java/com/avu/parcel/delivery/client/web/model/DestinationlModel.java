/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avu.parcel.delivery.client.web.model;

import java.io.Serializable;

/**
 *
 * @author Avuyile
 */
public class DestinationlModel implements Serializable 
{
    private Long id;
    private String destinationNumber;
    private  Long dropListDestinationid;

    public Long getDropListDestinationid() {
        return dropListDestinationid;
    }

    public void setDropListDestinationid(Long dropListDestinationid) {
        this.dropListDestinationid = dropListDestinationid;
    }
    
    
  

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestinationNumber() {
        return destinationNumber;
    }

    public void setDestinationNumber(String destinationNumber) {
        this.destinationNumber = destinationNumber;
    }
    
    
}