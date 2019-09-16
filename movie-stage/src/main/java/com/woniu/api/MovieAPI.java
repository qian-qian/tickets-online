package com.woniu.api;

import com.woniu.service.MovieService;
import com.woniu.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("movie")
public class MovieAPI {
    @Resource
    private MovieService movieService;
    @GetMapping
    public Result selectMovie(Integer mid) throws Exception{
        System.out.println(mid);
//        return new Result("success",null,null,movieService.selectMovie(mid));
        return null;
    }
}
