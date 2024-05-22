package com.gj.domian;

import java.util.HashMap;

public class OrderGJ {
    private String orderId;
    private HashMap<String,Product>productInfo;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public HashMap<String, Product> getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(HashMap<String, Product> productInfo) {
        this.productInfo = productInfo;
    }
}
