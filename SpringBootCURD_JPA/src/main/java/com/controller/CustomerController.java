package com.controller;

import com.entities.Customer;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;
    @GetMapping("/getAll")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping("/get/{customerId}")
    public Customer getCustomer(@PathVariable final Integer customerId){
        return customerService.getCustomer(customerId);
    }

    @PostMapping("/add")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @DeleteMapping("/delete/{customerId}")
    public void deleteCustomer(@PathVariable final Integer customerId){
        customerService.deleteUser(customerId);
    }

}
