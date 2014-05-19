/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avu.parcel.delivery.services;

import com.avu.parcel.delivery.client.web.model.CustomerModel;
import com.avu.parcel.delivery.model.Customer;
import java.util.List;

/**
 *
 * @author Avuyile
 */
public interface CustomerService{
    public List<Customer> createCustomer(CustomerModel model);
    public List<Customer> deleteCustomer(Long id);
    public CustomerModel getCustomerToedit( Long id);
    public List<Customer> updateCustomer(CustomerModel model,Long id);
    public List<Customer> getCustomers();

    public List<Customer> findAll();
}

