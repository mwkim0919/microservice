package com.minwoo.customer.services;

import com.minwoo.customer.entities.Customer;
import com.minwoo.customer.models.OrderModel;
import com.minwoo.customer.repositories.CustomerRepository;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomersByPage(int pageNumber, int size) {
        PageRequest pageRequest = PageRequest.of(pageNumber, size);
        Page<Customer> customers = customerRepository.findAll(pageRequest);
        return customers.getContent();
    }

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
