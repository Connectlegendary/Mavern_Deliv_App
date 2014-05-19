/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avu.parcel.delivery.services;

import com.avu.parcel.delivery.client.web.model.DestinationlModel;
import com.avu.parcel.delivery.model.Destination;
import java.util.List;

/**
 *
 * @author Avuyile
 */

public interface DestinationService{
    public List<Destination> createDestination(DestinationlModel model);
    public List<Destination> deleteDestination(Long id);
    public DestinationlModel getDestinationToedit(Long id);
    public List<Destination> updateDestination(DestinationlModel model);
    public List<Destination> getDestinations();

    public List<Destination> findAll();
}

