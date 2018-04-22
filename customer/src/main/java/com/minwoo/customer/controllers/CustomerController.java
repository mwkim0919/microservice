package com.minwoo.customer.controllers;

import com.minwoo.customer.databaseConfigs.DatasourceContext;
import com.minwoo.customer.entities.Customer;
import com.minwoo.customer.models.CustomerModel;
import com.minwoo.customer.repositories.CustomerRepository;
import com.minwoo.customer.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "customers/{id}")
    public ResponseEntity<CustomerModel> getCustomerById(@PathVariable("id") int id) {
        DatasourceContext.setCurrentDatasource("311");
        Optional<Customer> customer = customerRepository.findById(id);
        if (!customer.isPresent()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(CustomerModel.parseCustomer(customer.get()));
        }
    }

    @GetMapping(value = "customers")
    public ResponseEntity<CustomerModel> getCustomerByEmail(@RequestParam("email") String email) {
        DatasourceContext.setCurrentDatasource("311");
        Customer customer = customerService.findByEmail(email);
        if (customer == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(CustomerModel.parseCustomer(customer));
        }
    }
}
