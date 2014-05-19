/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avu.parcel.delivery.services;

import com.avu.parcel.delivery.client.web.model.ParcelModel;
import com.avu.parcel.delivery.model.Parcel;
import java.util.List;

/**
 *
 * @author Avuyile
 */
public interface ParcelService {
    public List<Parcel> createParcel(ParcelModel model);
    public List<Parcel> deleteParcel(Long id);
    public ParcelModel getParcelToedit(Long id);
    public List<Parcel> updateParcel(ParcelModel model);
    public List<Parcel> getParcels();

    public List<Parcel> findAll();
}

