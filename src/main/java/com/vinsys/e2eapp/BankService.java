package com.vinsys.e2eapp;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankService {
	Logger logger = Logger.getLogger("");
	// we know that service
	@RequestMapping(method = RequestMethod.GET, path = "cloudget")
	public String openAccount(@RequestParam(name = "parameter") String parameter) {
		logger.info("you are opening a account with " + parameter);
		String s="Hi, I am Chintan. This is my first cloud API, n Thanks for visiting";
		return s;
	}
}
