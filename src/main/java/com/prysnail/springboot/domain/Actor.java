package com.prysnail.springboot.domain;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 演员实体类
 * @author prysnail
 * @date 2019/12/17 18:39
 */
@Data
public class Actor implements Serializable {
    private static final long serialVersionUID = -1L;

    private Long actorId;

    private String firstName;

    private String lastName;

    private Timestamp lastUpdate;
}
