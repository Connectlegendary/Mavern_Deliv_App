package com.avu.parcel.delivery.repository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.avu.parcel.delivery.gitRepository.CustomerRepo;
import com.avu.parcel.delivery.gitRepository.EmployeeRepo;
import com.avu.parcel.delivery.model.Customer;
import com.avu.parcel.delivery.model.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Avuyile
 */
public class CustomerRepoTest {
     public static ApplicationContext ctx;
    private Long id;

    private CustomerRepo repo;
    private EmployeeRepo empRepo;
    
    public CustomerRepoTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void hello() {
         repo = ctx.getBean(CustomerRepo.class);
         Customer cust = new Customer();
         
         Employee employee1 = empRepo.findOne(id);
         
         List<Employee> emp = new ArrayList<Employee>();
         emp.add(employee1);
         
         Map<String, String> contValues = new HashMap<String, String>(); 
         contValues.put("cellNumber", "0719477233");
         contValues.put("phoneNumber", "0213456434");
         
         cust.setCustomerNumber("E221");
         cust.setContact(null);
         cust.setCostumerAddress(null);
         cust.setEmployee(emp);
         cust.setGemographic(null);
         repo.save(cust);
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
