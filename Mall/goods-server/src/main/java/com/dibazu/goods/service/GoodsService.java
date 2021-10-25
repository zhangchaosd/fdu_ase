package com.dibazu.goods.service;

import com.dibazu.goods.entity.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> findAll();
    Integer addGoods(Goods goods);
    List<Goods> getGoodsBySeller(String seller);
    List<Goods> getGoodsByKeyword(String keyword);
    //List<Goods> getGoodsById(String seller);
}
