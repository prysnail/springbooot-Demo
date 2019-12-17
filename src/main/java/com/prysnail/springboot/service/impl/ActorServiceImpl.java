package com.prysnail.springboot.service.impl;

import com.prysnail.springboot.domain.Actor;
import com.prysnail.springboot.mapper.ActorMapper;
import com.prysnail.springboot.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 演员业务逻辑实现类
 * @author prysnail
 * @date 2019/12/17 18:58
 */
@Service
public class ActorServiceImpl implements ActorService  {

    @Autowired
    private ActorMapper actorMapper;

    @Override
    public Actor findByFirstName(String firstName) {
        return actorMapper.findByFirstName(firstName);
    }
}
