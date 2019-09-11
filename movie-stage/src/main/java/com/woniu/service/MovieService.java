package com.woniu.service;

import com.woniu.entity.Movie;

import java.util.List;

public interface MovieService {
    public List<Movie> selectMovie(Integer mid) throws Exception;
}
