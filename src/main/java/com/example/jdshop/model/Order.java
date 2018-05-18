package com.example.jdshop.model;

public class Order {
    private long productId;
    private int number;

    public Order(){}
    public Order(long productId, int number){
        this.productId = productId;
        this.number = number;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
