package com.prysnail.springboot.service;

import com.prysnail.springboot.domain.EsFilm;

import java.util.List;

/**
 * @author prysnail
 * @date 2019/12/21 13:20
 */
public interface EsFilmService {

    /**
     * 保存电影
     * @param film
     * @return
     */
    Long saveFilm(EsFilm film);

    /**
     * 查询电影
     * @param title
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<EsFilm > searchFilm(String title , Integer pageNum , Integer pageSize);
}
