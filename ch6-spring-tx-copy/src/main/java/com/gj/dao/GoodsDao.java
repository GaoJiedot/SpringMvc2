package com.gj.dao;

import com.gj.entity.Goods;

public interface GoodsDao {
    int updataGoods(Goods goods);
    Goods selectGoodsByid(Integer id);
}
