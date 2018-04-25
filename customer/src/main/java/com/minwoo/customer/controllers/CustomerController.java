package com.minwoo.customer.controllers;

import com.minwoo.customer.databaseConfigs.DatasourceContext;
import com.minwoo.customer.entities.Customer;
import com.minwoo.customer.models.CustomerModel;
import com.minwoo.customer.repositories.CustomerRepository;
import com.minwoo.customer.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerService customerService;

    @PreAuthorize("#oauth2.hasScope('customer.me')")
    @GetMapping(value = "/customers")
    public ResponseEntity<List<Customer>> getCustomers(
            @RequestParam(value = "page", required = true) int page,
            @RequestParam(value = "size", required = true) int size
    ) {
        DatasourceContext.setCurrentDatasource("311");
        List<Customer> result = customerService.getCustomersByPage(page, size);
        return ResponseEntity.ok(result);
    }

    @PreAuthorize("#oauth2.hasScope('customer.me')")
    @GetMapping(value = "/customers/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") int id) {
        DatasourceContext.setCurrentDatasource("311");
        Optional<Customer> result = customerRepository.findById(id);
        if (!result.isPresent()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(result.get());
        }
    }

    @PreAuthorize("#oauth2.hasScope('customer.me')")
    @PostMapping(value = "/customers")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        DatasourceContext.setCurrentDatasource("311");
        Customer result = customerRepository.saveAndFlush(customer);
        if (result == null) {
            return ResponseEntity.badRequest().build();
        } else {
            URI location = ServletUriComponentsBuilder
                    .fromCurrentRequest()
                    .path("/{id}").
                            buildAndExpand(result.getId())
                    .toUri();
            return ResponseEntity.created(location).body(result);
        }
    }
}
