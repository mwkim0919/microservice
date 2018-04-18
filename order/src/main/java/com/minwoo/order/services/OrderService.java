package com.minwoo.order.services;

import com.minwoo.order.entities.Order;

import java.util.List;

public interface OrderService {

    List<Order> getOrdersByPage(int pageNumber, int size);
}
