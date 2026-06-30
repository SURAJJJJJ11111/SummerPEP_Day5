package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductAsysncService {
	private final ProductController productController;
	@Autowired
	private RestTemplate restTemplate;

	ProductAsysncService(ProductController productController) {
		this.productController = productController;
	}

	@Async
	public void fetchProduct() {
		String response=restTemplate.getForObject("http://localhost:9302/product", String.class);
		System.out.println(response);
		

	}

}
