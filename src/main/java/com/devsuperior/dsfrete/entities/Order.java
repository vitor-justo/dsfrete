package com.devsuperior.dsfrete.entities;

import org.springframework.beans.factory.annotation.Autowired;

public class Order {

    @Autowired
    private Integer code;
    @Autowired
    private Double basic;
    @Autowired
    private Double discount;

    public Order (Integer code, Double basic, Double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public Double getDiscount() {
        return discount;
    }

    public Double getBasic() {
        return basic;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }
}
