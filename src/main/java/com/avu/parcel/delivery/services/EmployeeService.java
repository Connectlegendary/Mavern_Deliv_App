/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avu.parcel.delivery.services;

import com.avu.parcel.delivery.client.web.model.EmployeeModel;
import com.avu.parcel.delivery.model.Employee;
import java.util.List;

/**
 *
 * @author Avuyile
 */
public interface EmployeeService {
    public List<Employee> createEmployee(EmployeeModel model);
    public List<Employee> deleteEmployee(Long id);
    public EmployeeModel getEmployeeToedit(Long id);
    public List<Employee> updateEmployee(EmployeeModel model, Long id);
    public List<Employee> getEmployee();

    public List<Employee> findAll();
}

