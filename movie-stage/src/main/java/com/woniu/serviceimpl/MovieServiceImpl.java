package com.woniu.serviceimpl;

import com.woniu.entity.Movie;
import com.woniu.mapper.MovieMapper;
import com.woniu.service.MovieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Resource
    private MovieMapper movieMapper;
    @Override
    public List<Movie> selectMovie(Integer mid) throws Exception {
        Movie movie = movieMapper.selectByPrimaryKey(mid);
        System.out.println(movie);
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(movie);
        return list;
    }
}
