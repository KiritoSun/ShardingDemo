package com.zt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("goods")
public class Goods {

    @TableId(value="goods_id", type= IdType.INPUT)
    private Long goodsId;

    @TableField(value = "goods_name")
    private String goodsName;

    @TableField(value = "goods_type")
    private Long goodsType;
}
