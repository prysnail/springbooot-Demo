package com.prysnail.springboot.controller;

import com.prysnail.springboot.domain.EsFilm;
import com.prysnail.springboot.service.EsFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author prysnail
 * @date 2019/12/21 12:58
 */
@RestController
public class EsFilmController {
    @Autowired
    private EsFilmService esFilmService;

    /**
     * 创建电影
     * @return
     */
    @RequestMapping(value = "api/film" , method = RequestMethod.GET)
    public Long createFilm(){
        EsFilm film = new EsFilm();
        film.setFileId(2L);
        film.setTitle("filmTitle");
        film.setDescription("描述");
        return esFilmService.saveFilm(film);
    }

    /**
     * 查询电影
     * @param title
     * @return
     */
    @RequestMapping(value = "api/film/{title}" , method = RequestMethod.GET)
    public List<EsFilm > searchFilm(@PathVariable String title){
        return esFilmService.searchFilm(title , 1 , 10);
    }
}
