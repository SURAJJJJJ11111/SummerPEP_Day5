package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.consumer.CartRestConsumer;
import com.example.demo.consumer.IciciRestConsumer;

@RestController
public class PaymentController {

    @Autowired
    private CartRestConsumer cartRestConsumer;

    @Autowired
    private IciciRestConsumer iciciRestConsumer;

    @GetMapping("/payment/data")
    public String getPaymentData() {

        return "From Payment Service\n\n"
                + cartRestConsumer.getCartData()
                + "\n\n"
                + iciciRestConsumer.getBankData();
    }
}