package com.repository;

import com.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {

    @Transactional
    public void deleteByCustomerId(Integer customerId);
}
