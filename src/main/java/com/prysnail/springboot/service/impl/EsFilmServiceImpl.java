package com.prysnail.springboot.service.impl;

import com.google.common.collect.Lists;
import com.prysnail.springboot.Repository.EsFilmRepository;
import com.prysnail.springboot.domain.EsFilm;
import com.prysnail.springboot.service.EsFilmService;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

/**
 * @author prysnail
 * @date 2019/12/21 13:25
 */
@Service
public class EsFilmServiceImpl implements EsFilmService {

    @Autowired
    private EsFilmRepository filmRepository;

    @Override
    public Long saveFilm(EsFilm film) {
        EsFilm result = filmRepository.save(film);
        return result.getFileId();
    }

    @Override
    public List<EsFilm> searchFilm(String title, Integer pageNum, Integer pageSize) {
        //查询
        QueryBuilder queryBuilder = QueryBuilders.matchQuery("title" , "filmTitle");
        Iterable<EsFilm> results = filmRepository.search(queryBuilder);

        ArrayList<EsFilm> list = Lists.newArrayList(results);
        return list;
    }
}
