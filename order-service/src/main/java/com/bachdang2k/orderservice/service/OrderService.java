package com.bachdang2k.orderservice.service;

import com.bachdang2k.orderservice.dto.OrderRequest;

public interface OrderService {
    String placeOrder(OrderRequest orderRequest);

}
