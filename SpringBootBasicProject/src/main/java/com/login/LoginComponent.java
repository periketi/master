package com.login;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.model.LoginDetails;
import com.service.LoginService;

@RestController
public class LoginComponent {
	
	@Autowired
	InternalResourceViewResolver viewresource = null;
	@Autowired
	LoginService sevice ;
	
	@RequestMapping(value = "/logindetails")
	public Map<String,LoginDetails> getAllLoginDetails() {
		return sevice.getLoginDetails();
	}
	@RequestMapping(method=RequestMethod.GET,value="/logindetails/{id}")
	public LoginDetails getLoginDetails(@PathVariable("id") String id) {
		System.out.println("id=====>"+id);
		return sevice.getLoginDetails(id);
	}
}
