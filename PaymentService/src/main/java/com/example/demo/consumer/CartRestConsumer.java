package com.example.demo.consumer;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient ;
@Component
public class CartRestConsumer {
	@Autowired
	private DiscoveryClient discoveryClient;
	 
	public String getCartData() {
		List<ServiceInstance>instance=discoveryClient.getInstances("CartService");
		if(instance==null || instance.isEmpty()) {
			return "Cart service not avaliable";
		}
		//Pick first availabe Instance 
 ServiceInstance instances=instance.get(0);
	///Create url to cacll Cart services
String url= instances.getUri()+"/cart/getdata";

RestTemplate restTemplate=new RestTemplate();
return restTemplate.getForObject(url, String.class);
	}
	
	public String getBankData() {

        List<ServiceInstance> instances =
                discoveryClient.getInstances("ICICIService");

        if (instances.isEmpty()) {
            return "ICICI Service Not Available";
        }

        String url = instances.get(0).getUri() + "/bank/account";

        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(url, String.class);
    }
	
	
	
}
