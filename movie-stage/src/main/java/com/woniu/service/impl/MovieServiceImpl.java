package com.woniu.service.impl;

import com.woniu.entity.Movie;
import com.woniu.service.MovieService;

import java.util.Date;
import java.util.List;

public class MovieServiceImpl implements MovieService {
    @Override
    public Movie selectMovieByMid(Integer mid) throws Exception {
        return null;
    }

    @Override
    public List<Movie> selectMoviesByCid(Integer cid) throws Exception {
        return null;
    }

    @Override
    public List<Movie> selectMoviesBytid(Integer tid, String comntry, Date uptime, Integer pageIndex, Integer num) throws Exception {
        return null;
    }
}
