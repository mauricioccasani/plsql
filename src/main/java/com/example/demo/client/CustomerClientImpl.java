package com.example.demo.client;

import com.example.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerClientImpl {


    @Autowired
    private RestTemplate restTemplate;

    public Customer findById(String id) {
        return this.restTemplate.getForObject("http://localhost:8882/customers/"+id, Customer.class);
    }
}
