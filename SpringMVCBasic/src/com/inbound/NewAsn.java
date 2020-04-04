package com.inbound;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.components.AsnDO;

@Controller
public class NewAsn {

	@Autowired
	AsnService asnService;

	@RequestMapping(value = "/newasns", method = RequestMethod.GET)
	public ModelAndView printHello() {
		ModelAndView mandv = new ModelAndView("newasn");
		AsnDO asnList = asnService.getAsnDetails();
		mandv.addObject("asnList",asnList);
		return mandv;
	}

}
