package com.repository;

import com.security.SpringSecurity.AddressDetails;
import com.security.SpringSecurity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserDetails,Integer> {

 }
