package com.minwoo.order.controllers;

import com.minwoo.order.configs.databaseConfigs.Database;
import com.minwoo.order.configs.databaseConfigs.DatabaseList;
import com.minwoo.order.configs.databaseConfigs.DatasourceContext;
import com.minwoo.order.entities.Order;
import com.minwoo.order.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private DatabaseList databaseList;

    @GetMapping(value = "/orders")
    public List<Order> getOrders(
            @RequestParam(value = "page", required = true) int page,
            @RequestParam(value = "size", required = true) int size,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "order", required = false) Sort.Direction sortMethod
            ) {
        DatasourceContext.setCurrentDatasource("311");
        return orderService.getOrdersByPage(page, size);
    }

    @GetMapping(value = "/databases")
    public List<Database> getDatasources() {
        return databaseList.getDatabase();
    }

}
