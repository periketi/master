package com.security.SpringSecurity;

import com.repository.AddressRepository;
import com.repository.PersonalRepository;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public  class UserService {

    @Autowired
    private UserRepository userRepo;
    @Autowired
    private PersonalRepository personalRepo;
    @Autowired
    private AddressRepository addressRepo;


    @GetMapping("/greeting")
    public String test(){
        return "Hello";
    }

    @GetMapping("/userDetails/{userId}")
    public UserDetails getUserDetails(@PathVariable("userId") Integer userId){

        UserDetails  userDetails = userRepo.findById(userId).get();
        PersonalInfo  personalInfo = personalRepo.findById(userId).get();
        AddressDetails  addressDetails = addressRepo.findById(userId).get();
        List<AddressDetails> addressDetailsList = new ArrayList<AddressDetails>();
        addressDetailsList.add(addressDetails);
        personalInfo.setAddress(addressDetailsList);
        userDetails.setPersonalInfo(personalInfo);

         return  userDetails;
    }
}