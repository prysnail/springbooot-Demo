package com.prysnail.springboot.service;

import com.prysnail.springboot.domain.Actor;

/**
 * 演员业务逻辑接口
 * @author prysnail
 * @date 2019/12/17 18:55
 */
public interface ActorService {

    /**
     * 通过firstName查询演员信息
     * @param firstName
     * @return
     */
    Actor findByFirstName (String firstName);
}
