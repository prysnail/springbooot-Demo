package com.prysnail.springboot.service;

import com.prysnail.springboot.domain.Actor;
import org.apache.ibatis.annotations.Param;

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

    /**
     * 通过id查询数据
     * 现在缓存中查找，如果没有，则将数据库查找结果写入缓存
     * @param actorId
     * @return
     */
    Actor findByActorIdWithCache(Long actorId);
}
