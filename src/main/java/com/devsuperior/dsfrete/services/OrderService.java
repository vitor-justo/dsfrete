package com.devsuperior.dsfrete.services;

import com.devsuperior.dsfrete.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double pedido(Order order) {
        return order.getBasic() * (1 - (order.getDiscount() / 100)) +
                shippingService.frete(order.getBasic());
    }
}
