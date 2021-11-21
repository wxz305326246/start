package com.wxz.service;

import com.wxz.entity.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@FeignClient("user-server")
public interface GoodsService {
    @GetMapping("list")
    List<Goods> selectgoods();
}
