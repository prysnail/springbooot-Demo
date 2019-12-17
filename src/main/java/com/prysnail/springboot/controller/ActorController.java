package com.prysnail.springboot.controller;

import com.prysnail.springboot.domain.Actor;
import com.prysnail.springboot.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 演员Controller
 * @author prysnail
 * @date 2019/12/17 19:10
 */
@RestController
public class ActorController {

    @Autowired
    private ActorService actorService;

    @RequestMapping("/api/actor")
    public Actor findByFirstName(@RequestParam String firstName){
        return actorService.findByFirstName(firstName);
    }
}
