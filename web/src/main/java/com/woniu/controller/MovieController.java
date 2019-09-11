package com.woniu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("getmovie")
public class MovieController {
    @Resource
    private RestTemplate restTemplate;
    @RequestMapping
    public String selectMovie(Integer mid) throws Exception{
        return restTemplate.getForObject("http://user-system/movie?mid="+mid,String.class);
    }

}
