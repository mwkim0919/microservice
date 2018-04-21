package com.minwoo.order.proxies;

import com.minwoo.order.entities.Customer;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Customer")
@RibbonClient(name = "Customer")
public interface CustomerProxy {
    @GetMapping("/customers/{id}")
    ResponseEntity<Customer> getCustomerById(@PathVariable("id") int id);
}
