/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avu.parcel.delivery.services.impl;

import com.avu.parcel.delivery.client.web.model.CitizenModel;
import com.avu.parcel.delivery.gitRepository.CitizenRepo;
import com.avu.parcel.delivery.model.Citizen;
import com.avu.parcel.delivery.services.CitizenService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Avuyile
 */
public class CitizenServiceImpl implements CitizenService{
    
    @Autowired
    private CitizenRepo citizenRepo;

    @Override
    public List<Citizen> createCitizen(CitizenModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Citizen> deleteCitizen(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CitizenModel getCitizenToedit(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Citizen> updateCitizen(CitizenModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Citizen> getCitizens() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Citizen> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}
