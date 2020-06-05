package com.zt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@TableName("ids_user")
@Data
@EqualsAndHashCode(callSuper=false)
public class IdsUser {
    /**
     * id字段
     */
    @TableId(value="id", type= IdType.INPUT)
    private Long id;

    /**
     * uid
     */
    @TableField(value = "u_id")
    private String uId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;
}
