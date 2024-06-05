package com.gj.service.Impl;

import com.gj.NotEnoughException;
import com.gj.dao.GoodsDao;
import com.gj.dao.SaleDao;
import com.gj.entity.Goods;
import com.gj.entity.Sale;
import com.gj.service.BuyGoodsService;

import javax.annotation.Resource;
import java.util.List;

public class BuyGoodsServiceImpl implements BuyGoodsService {
    private SaleDao saleDao;
    private GoodsDao goodsDao;

    public SaleDao getSaleDao() {
        return saleDao;
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public GoodsDao getGoodsDao() {
        return goodsDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    @Override
    public void buy(Integer goodsId, Integer num) {
        System.out.println("-----buy方法的开始-----");
        //生成销售记录
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNum(num);
        saleDao.insertSale(sale);

        //查询商品
        Goods goods = goodsDao.selectGoodsByid(goodsId);
        if(goods ==null){
            throw new NullPointerException(goodsId+",商品不存在");
        }else if(goods.getAmount() < num){
            throw  new NotEnoughException(goodsId+",库存不足");
        }

        //更新库存
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(num);
        goodsDao.updataGoods(buyGoods);

        System.out.println("-----buy方法的结束-----");
    }
}
