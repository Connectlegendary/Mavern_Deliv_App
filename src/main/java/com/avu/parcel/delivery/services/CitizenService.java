/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avu.parcel.delivery.services;

import com.avu.parcel.delivery.client.web.model.CitizenModel;
import com.avu.parcel.delivery.model.Citizen;
import java.util.List;

/**
 *
 * @author Avuyile
 */
public interface CitizenService {
    public List<Citizen> createCitizen(CitizenModel model);
    public List<Citizen> deleteCitizen(Long id);
    public CitizenModel getCitizenToedit(Long id);
    public List<Citizen> updateCitizen(CitizenModel model);
    public List<Citizen> getCitizens();

    public List<Citizen> findAll();
}

