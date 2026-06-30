package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductControler {
@GetMapping("/product")
public String getProduct() throws Exception
{
	Thread.sleep(5000);
	return "Laptop price is = 60000";
}
}
