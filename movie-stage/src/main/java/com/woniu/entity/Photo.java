package com.woniu.entity;

import lombok.Data;

@Data
public class Photo {
    /**
    * 图片id
    */
    private Integer id;

    /**
    * 图片的url
    */
    private String url;

    /**
    * 类型：用户图片，影院图片，电影图片
    */
    private String type;
}