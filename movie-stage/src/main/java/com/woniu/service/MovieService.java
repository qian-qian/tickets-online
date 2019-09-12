package com.woniu.service;

import com.woniu.entity.Movie;

import java.util.Date;
import java.util.List;

public interface MovieService {
    /**
     * 根据id查电影详细信息
     * @param mid
     * @return
     * @throws Exception
     */
    Movie selectMovieByMid(Integer mid) throws Exception;

    /**
     * 根据影院id查电影集合
     * @param cid
     * @return
     * @throws Exception
     */
    List<Movie> selectMoviesByCid(Integer cid) throws Exception;


    /**
     * 根据影片类型，产地，上映时间查询电影
     * @param tid
     * @param comntry
     * @param uptime
     * @param pageIndex
     * @param num
     * @return
     * @throws Exception
     */
    List<Movie> selectMoviesBytid(Integer tid, String comntry, Date uptime, Integer pageIndex, Integer num) throws Exception;

}
