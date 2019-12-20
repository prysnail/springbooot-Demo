package com.prysnail.springboot.service.impl;

import com.github.pagehelper.PageHelper;
import com.prysnail.springboot.domain.Actor;
import com.prysnail.springboot.mapper.ActorMapper;
import com.prysnail.springboot.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
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
        PageHelper.startPage(1,1);
        return actorMapper.findByFirstName(firstName);
    }

    @Cacheable(value = "prysnail:actor",key = "#actorId")  //先在缓存中查找数据，存在则取出返回；不存在 则将返回值写入缓存
    @Override
    public Actor findByActorIdWithCache(Long actorId) {
        return actorMapper.findByActorId(actorId);
    }
}
