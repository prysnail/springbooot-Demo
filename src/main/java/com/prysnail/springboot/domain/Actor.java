package com.prysnail.springboot.domain;

import lombok.Data;

import java.sql.Timestamp;

/**
 * 演员实体类
 * @author prysnail
 * @date 2019/12/17 18:39
 */
@Data
public class Actor {

    private Long actorId;

    private String firstName;

    private String lastName;

    private Timestamp lastUpdate;
}
