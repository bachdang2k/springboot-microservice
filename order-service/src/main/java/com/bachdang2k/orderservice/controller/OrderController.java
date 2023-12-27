package com.bachdang2k.orderservice.controller;

import com.bachdang2k.orderservice.dto.OrderRequest;
import com.bachdang2k.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @PostMapping
    public String placeOrder(@RequestBody OrderRequest request) {
        service.placeOrder(request);
        return "Order Place Successfully";
    }
}
