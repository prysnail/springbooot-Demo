package com.prysnail.springboot.Repository;

import com.prysnail.springboot.domain.EsFilm;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * @author prysnail
 * @date 2019/12/21 12:57
 */
@Component
public interface EsFilmRepository extends ElasticsearchRepository<EsFilm, Long> {

}
