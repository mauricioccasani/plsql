package com.example.demo.client;

import com.example.demo.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
//@FeignClient(name = "ws-customer",url = "http://localhost:8882")
//@RequestMapping("/customers")
public interface CustomerFeignClient {
    //@GetMapping("/{id}")
   // public Customer getCustomer(@PathVariable String id);
}
