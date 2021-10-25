package com.dibazu.goods.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dibazu.goods.entity.Goods;
import com.dibazu.goods.service.GoodsService;

import javax.annotation.Resource;
import javax.naming.spi.DirStateFactory.Result;

import java.util.List;

@RestController
//@CrossOrigin(origins = "*",maxAge = 3600)
public class GoodsController {
    @Resource
    GoodsService goodsService;
//add,del,update,getbyseller,searchbyname,getbyid
    @PostMapping(value = "/goods/add")
    public Goods addGoods(@RequestBody Goods goods) {
        Integer ret = goodsService.addGoods(goods);
        if (ret == 1)
        {
            return goods;
        }
        return null;
    }

    @PostMapping(value = "/goods/update")
    public Goods updateGoods(@RequestBody Goods goods) {
        //TODO
        Integer ret = goodsService.addGoods(goods);
        if (ret == 1)
        {
            return goods;
        }
        return null;
    }

    @PostMapping(value = "/goods/del")
    public Goods delGoods(@RequestBody Goods goods) {
        //TODO
        Integer ret = goodsService.addGoods(goods);
        if (ret == 1)
        {
            return goods;
        }
        return null;
    }

    @PostMapping(value = "/goods/getgoodsbyseller")
    public List<Goods> getGoodsBySeller(@RequestBody Goods goods) {
        return goodsService.getGoodsBySeller(goods.getSeller());
    }

    @PostMapping(value = "/goods/getgoodsbykeyword")
    public List<Goods> getGoodsByKeyword(@RequestBody Goods goods) {
        return goodsService.getGoodsByKeyword(goods.getName());
    }

    @PostMapping(value = "/goods/getgoodsbyid")
    public List<Goods> getGoodsById(@RequestBody Goods goods) {
        //TODO
        return goodsService.getGoodsByKeyword(goods.getName());
    }

    @GetMapping(value = "/goods/test")
    public String test() {
        return "test succ";
    }
}
