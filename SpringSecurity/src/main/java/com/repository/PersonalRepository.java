package com.repository;

import com.security.SpringSecurity.PersonalInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalRepository extends JpaRepository<PersonalInfo,Integer>{
}
