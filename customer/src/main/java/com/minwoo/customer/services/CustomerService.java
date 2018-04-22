package com.minwoo.customer.services;

import com.minwoo.customer.entities.Customer;

public interface CustomerService {
    Customer findByEmail(String email);
}
