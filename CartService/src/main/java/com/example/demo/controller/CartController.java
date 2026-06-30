package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
@GetMapping("/cart/getdata")
public String getCartData() {
	return "Returning data from cart servcise";
	
}
}
