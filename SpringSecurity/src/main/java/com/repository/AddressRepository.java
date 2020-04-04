package com.repository;

import com.security.SpringSecurity.AddressDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressDetails,Integer> {
}
