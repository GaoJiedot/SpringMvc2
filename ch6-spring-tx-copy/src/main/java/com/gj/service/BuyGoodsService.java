package com.gj.service;

import com.gj.NotEnoughException;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED,
        isolation = Isolation.DEFAULT,
        readOnly = false,timeout = 20,
        rollbackFor ={NullPointerException.class, NotEnoughException.class})


public interface BuyGoodsService {
    void buy(Integer goodsId,Integer num);


}
