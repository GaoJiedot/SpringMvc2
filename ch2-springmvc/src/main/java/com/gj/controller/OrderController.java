package com.gj.controller;

import com.gj.domian.Order;
import com.gj.domian.OrderGJ;
import com.gj.domian.Product;
import com.gj.domian.User2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

@Controller
public class OrderController {
    @RequestMapping("/showOrders")
    public void showOders(User2 user2) {
        List<Order> orders = user2.getOrders();
        List<String> address = user2.getAddress();
        System.out.println("订单：");
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            String s = address.get(i);
            System.out.println("订单Id" + order.getOrderId());
            System.out.println("配送地址" + s);
        }
    }

    @RequestMapping("orderInfo")
    public void orderInfo(OrderGJ orderGJ) {
        String orderId = orderGJ.getOrderId();
        HashMap<String, Product> productInfo = orderGJ.getProductInfo();
        Set<String> keys = productInfo.keySet();
        System.out.println("订单Id:" + orderId);
        System.out.println("订单商品信息");
        for (String key : keys) {
            Product product = productInfo.get(key);
            int proId = product.getProId();
            String proName = product.getProName();
            System.out.println(key + "类" + "，商品Id" + proId + "，商品名称" + proName);
        }
    }

}
