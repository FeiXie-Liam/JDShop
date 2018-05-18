package com.example.jdshop.model;

enum ExpressState{
    on,
    off
}

public class ExpressList {
    private Order order;
    private ExpressState state;

    public ExpressList(){}
    public ExpressList(Order order){
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }
}
