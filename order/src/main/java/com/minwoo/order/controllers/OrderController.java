package com.minwoo.order.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping(value = "orders")
    public String getOrders() {
        return "This is orders";
    }
}
