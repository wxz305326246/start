package com.wxz.service.impl;

import com.wxz.entity.Goods;
import com.wxz.entity.Shop;
import com.wxz.mapper.GoodsMapper;
import com.wxz.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> selectgoods() {
        ArrayList<Shop> shops = new ArrayList<>();
        shops.add(new Shop(1,2,"222",1,1));
        shops.add(new Shop(2,2,"222",1,1));
        shops.add(new Shop(3,2,"222",1,1));
        shops.add(new Shop(4,2,"222",1,1));
        shops.add(new Shop(5,2,"222",1,1));
        return goodsMapper.selectgoods();
    }
}
