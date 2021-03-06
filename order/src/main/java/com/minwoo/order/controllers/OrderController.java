package com.minwoo.order.controllers;

import com.minwoo.order.configs.databaseConfigs.Database;
import com.minwoo.order.configs.databaseConfigs.DatabaseList;
import com.minwoo.order.configs.databaseConfigs.DatasourceContext;
import com.minwoo.order.entities.Customer;
import com.minwoo.order.entities.Order;
import com.minwoo.order.proxies.CustomerProxy;
import com.minwoo.order.repositories.OrderRepository;
import com.minwoo.order.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    private CustomerProxy customerProxy;

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private DatabaseList databaseList;

    @GetMapping(value = "/orders")
    public ResponseEntity<List<Order>> getOrders(
            @RequestParam(value = "page", required = true) int page,
            @RequestParam(value = "size", required = true) int size
    ) {
        DatasourceContext.setCurrentDatasource("311");
        List<Order> results = orderService.getOrdersByPage(page, size);
        return ResponseEntity.ok(results);
    }

    @GetMapping(value = "/orders/{id}")
    public ResponseEntity<Order> getAnOrder(@PathVariable("id") int id) {
        DatasourceContext.setCurrentDatasource("311");
        Optional<Order> result = orderRepository.findById(id);
        if (result.isPresent()) {
            return ResponseEntity.ok(result.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/customers/{id}/orders")
    public ResponseEntity<List<Order>> getOrdersByCustomerId(@PathVariable("id") int customerId) {
        DatasourceContext.setCurrentDatasource("311");
        ResponseEntity<Customer> customerResult = customerProxy.findCustomerById(customerId);
        Customer customer = customerResult.getBody();
        if (customer != null) {
            List<Order> results = orderRepository.findOrderByMemberId(customer.getId());
            return ResponseEntity.ok(results);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/databases")
    public List<Database> getDatasources() {
        return databaseList.getDatabase();
    }

}
