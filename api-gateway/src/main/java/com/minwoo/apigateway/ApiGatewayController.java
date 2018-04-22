package com.minwoo.apigateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.Response;
import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class ApiGatewayController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/api/customers")
    public String getCustomerById() throws URISyntaxException {
        ResponseEntity response = restTemplate.exchange(new URI("services/customers/1"), HttpMethod.GET, null, String.class);
        return response.getBody().toString();
    }

    @GetMapping(value = "/api/orders")
    public String getOrders() throws URISyntaxException {
        ResponseEntity response = restTemplate
                .exchange(new URI("api/orders/101"), HttpMethod.GET, null, String.class);
        return response.getBody().toString();
    }
}
