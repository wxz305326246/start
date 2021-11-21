package com.wxz.controller;

import com.wxz.entity.Goods;
import com.wxz.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping("list")
    public List<Goods> selectgoods(){
        return goodsService.selectgoods();
    };
}
