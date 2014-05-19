/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avu.parcel.delivery.services;

import com.avu.parcel.delivery.client.web.model.TypeOfServiceModel;
import com.avu.parcel.delivery.model.TypeOfService;
import java.util.List;

/**
 *
 * @author Avuyile
 */
public interface TypeOfServiceService {
    public List<TypeOfService> createTypeOfService(TypeOfServiceModel model);
    public List<TypeOfService> deleteTypeOfService(Long id);
    public TypeOfServiceModel getTypeOfServiceToedit(Long id);
    public List<TypeOfService> updateTypeOfService(TypeOfServiceModel model);
    public List<TypeOfService> getTypeOfServices();

    public List<TypeOfService> findAll();
}

