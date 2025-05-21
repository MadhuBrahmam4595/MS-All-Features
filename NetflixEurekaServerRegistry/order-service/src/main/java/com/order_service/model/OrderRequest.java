package com.order_service.model;

public class OrderRequest {

    private String orderId;
    private String custEmail;
    private String item;

    public OrderRequest(){}

    public OrderRequest(String orderId, String custEmail, String item){
        this.orderId = orderId;
        this.custEmail = custEmail;
        this.item = item;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "orderId='" + orderId + '\'' +
                ", custEmail='" + custEmail + '\'' +
                ", item='" + item + '\'' +
                '}';
    }
}
