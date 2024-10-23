package com.devsuperior.dsfrete.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double frete(Double amount) {
        if (amount < 100) {
            return 20.00;
        } else if (amount < 200) {
            return 12.00;
        }
        return 00.00;
    }
}
