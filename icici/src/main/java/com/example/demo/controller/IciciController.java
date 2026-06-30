package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IciciController {
	  @GetMapping("/bank/account")
	    public String account() {
	        return "ICICI Bank Account Verified";
	    }

}
