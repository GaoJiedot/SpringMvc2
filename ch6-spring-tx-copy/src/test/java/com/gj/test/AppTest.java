package com.gj.test;

import com.gj.service.BuyGoodsService;
import com.gj.service.Impl.BuyGoodsServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;


public class AppTest {
    @Test
    public void test01(){
        String config="ac.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(config);
        BuyGoodsService service=(BuyGoodsService) context.getBean("buyService");
        service.buy(1002,10);
    }
    @Test
    public void test2() {
        String config = "ac.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        BuyGoodsService service = (BuyGoodsService) context.getBean("buyService");
        service.buy(1005, 10);
    }
    @Test
    public void test3() {
        String config = "ac.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        BuyGoodsService service = (BuyGoodsService) context.getBean("buyService");
        service.buy(1002, 200);
    }
}
