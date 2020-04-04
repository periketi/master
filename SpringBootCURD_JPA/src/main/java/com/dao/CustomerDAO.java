package com.dao;

import com.entities.Customer;
import com.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAO {
    @Autowired
    CustomerRepo customerRepo;

    public List<Customer> getCustomers() {
        return customerRepo.findAll();
    }

    public Customer addCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    public Customer getCustomer(Integer customerId) {
        return customerRepo.findById(customerId).get();
    }

    public void deleteCustomer(Integer customerId) {
         customerRepo.deleteByCustomerId(customerId);
    }
}
