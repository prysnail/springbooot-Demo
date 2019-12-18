package com.prysnail.springboot.mapper;

import com.prysnail.springboot.domain.Actor;
import org.apache.ibatis.annotations.Param;

/**
 * 演员 接口类
 * @author prysnail
 * @date 2019/12/17 18:50
 */
public interface ActorMapper {

    /**
     * 通过firstName查询演员信息
     * @param firstName
     * @return
     */
    Actor findByFirstName(@Param("firstName") String firstName);

    /**
     * 根据id查询演员信息
     * @param actorId
     * @return
     */
    Actor findByActorId(@Param("actorId") Long actorId);
}
