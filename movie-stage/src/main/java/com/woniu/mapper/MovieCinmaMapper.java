package com.woniu.mapper;

import com.woniu.entity.MovieCinma;

public interface MovieCinmaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MovieCinma record);

    int insertSelective(MovieCinma record);

    MovieCinma selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MovieCinma record);

    int updateByPrimaryKey(MovieCinma record);
}