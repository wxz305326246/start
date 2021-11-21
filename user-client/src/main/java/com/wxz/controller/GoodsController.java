package com.wxz.controller;

import com.wxz.entity.Goods;
import com.wxz.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping("list")
    public String list(HttpServletRequest request){
        List<Goods> goodsList=goodsService.selectgoods();
        request.setAttribute("slist",goodsList);
        return "list";
    }

}
