package com.service;

import com.dao.CustomerDAO;
import com.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerDAO customerDAO;

    public List<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }

    public Customer addCustomer(Customer customer) {
       return customerDAO.addCustomer(customer);
    }

    public Customer getCustomer(Integer customerId) {
        return customerDAO.getCustomer(customerId);
    }

    public void deleteUser(Integer customerId) {
         customerDAO.deleteCustomer(customerId);
    }
}
