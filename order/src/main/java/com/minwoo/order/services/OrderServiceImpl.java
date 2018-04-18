package com.minwoo.order.services;

import com.minwoo.order.entities.Order;
import com.minwoo.order.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getOrdersByPage(int pageNumber, int size) {
        PageRequest pageRequest = PageRequest.of(pageNumber, size);
        Page<Order> orders = orderRepository.findAll(pageRequest);
        return orders.getContent();
    }
}
