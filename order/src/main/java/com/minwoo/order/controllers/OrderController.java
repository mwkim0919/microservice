package com.minwoo.order.controllers;

import com.minwoo.order.configs.databaseConfigs.Database;
import com.minwoo.order.configs.databaseConfigs.DatabaseList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private Database database;

    @Autowired
    private DatabaseList databaseList;

    @GetMapping(value = "/orders")
    public String getOrders() {
        return "This is orders";
    }

    @GetMapping(value = "/database")
    public Database getDatasource() {
        return database;
    }

    @GetMapping(value = "/databases")
    public List<Database> getDatasources() {
        return databaseList.getDatabase();
    }

}
