package com.minwoo.customer.services;

import com.minwoo.customer.entities.Customer;
import com.minwoo.customer.repositories.CustomerRepository;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;

    @Override
    public Customer findByEmail(String email) {
        Customer result = null;
        if (!StringUtils.containsIgnoreCase(email, "noemail")) {
            List<Customer> potentialResults = customerRepository.findCustomersByEmail(email);
            result = potentialResults.get(0);
        }
        return result;
    }
}
