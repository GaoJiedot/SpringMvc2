package com.gj.controller;

import com.gj.domian.Product;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class ProductController {
    @RequestMapping("getProducts")
    public void getProducts(@RequestParam("proIds") List<String> proIds){
        for (String proId:proIds
             ) {
            System.out.println(proIds);
        }
    }
    @RequestMapping("getProduct")
    public void getProduct(@RequestBody Product product){
        System.out.println(product.getProId());
        System.out.println(product.getProName());
    }

    @RequestMapping("getProduct")
    public void getProductList(@RequestBody List<Product>products){
        for (Product product:products
             ) {
            System.out.println("商品Id"+product.getProId());
            System.out.println("商品名称"+product.getProName());
        }
    }
}
