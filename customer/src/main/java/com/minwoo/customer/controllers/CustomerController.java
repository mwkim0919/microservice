package com.minwoo.customer.controllers;

import com.minwoo.customer.databaseConfigs.DatasourceContext;
import com.minwoo.customer.entities.Customer;
import com.minwoo.customer.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping(value = "customers/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") int id) {
        DatasourceContext.setCurrentDatasource("311");
        Customer result = customerRepository.getOne(id);
        if (result == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(result);
        }
    }
}
