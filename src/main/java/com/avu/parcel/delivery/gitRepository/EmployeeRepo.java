/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avu.parcel.delivery.gitRepository;

import com.avu.parcel.delivery.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Avuyile
 */
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{
    
}
