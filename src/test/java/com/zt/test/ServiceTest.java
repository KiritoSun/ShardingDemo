package com.zt.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zt.entity.Goods;
import com.zt.mapper.GoodsMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ServiceTest {

    @Autowired
    private GoodsMapper goodsMapper;

    @Test
    public void fun1() {
        for(int i= 1 ; i <= 40 ; i ++){
            Goods goods = new Goods();
            goods.setGoodsId((long) i);
            goods.setGoodsName( "shangpin" + i);
            goods.setGoodsType((long) (i+1));
            goodsMapper.insert(goods);
        }
    }

    @Test
    public void fun2() {
        QueryWrapper<Goods> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("goods_id", 8L);
        Goods goods = goodsMapper.selectOne(queryWrapper);
        System.out.print(goods);
    }

}
