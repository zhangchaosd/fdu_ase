package com.dibazu.goods.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.dibazu.goods.entity.Goods;
import com.dibazu.goods.repository.GoodsRepository;
import com.dibazu.goods.service.GoodsService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    GoodsRepository goodsRepository;

    @Override
    public List<Goods> findAll() {
        return goodsRepository.findAll();
    }

    @Override
    public Integer addGoods(Goods goods) {
        goodsRepository.save(goods);
        return 1;
    }

    @Override
    public List<Goods> getGoodsBySeller(String seller) {
        return goodsRepository.findGoodsBySeller(seller);
    }

    @Override
    public List<Goods> getGoodsByKeyword(String keyword) {
        return goodsRepository.findByNameContaining(keyword);
    }
}
