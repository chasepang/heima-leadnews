package com.heima.freemarker.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author: Chase
 * @date: 2024-05-29
 * @description: TODO
 **/
@Data
public class Student {
    private String name;//姓名
    private int age;//年龄
    private Date birthday;//生日
    private Float money;//钱包
}
