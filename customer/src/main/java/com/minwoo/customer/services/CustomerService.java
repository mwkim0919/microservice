package com.minwoo.customer.services;

import com.minwoo.customer.entities.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomersByPage(int pageNumber, int size);

    Customer findByEmail(String email);
}
