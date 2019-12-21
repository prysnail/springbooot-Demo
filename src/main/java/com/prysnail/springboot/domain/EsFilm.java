package com.prysnail.springboot.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * 电影实体类
 * @author prysnail
 * @date 2019/12/21 12:54
 */
@Document(indexName = "sakila" , type = "film")
@Data
public class EsFilm {
    @Id
    private Long fileId;
    private String title;
    private String description;
}
