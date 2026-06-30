package com.example.demo.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class IciciRestConsumer {

    @Autowired
    private DiscoveryClient discoveryClient;

    public String getBankData() {

        List<ServiceInstance> instances = discoveryClient.getInstances("ICICIService");

        if (instances == null || instances.isEmpty()) {
            return "ICICI Service Not Available";
        }

        String url = instances.get(0).getUri() + "/bank/account";

        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(url, String.class);
    }
}