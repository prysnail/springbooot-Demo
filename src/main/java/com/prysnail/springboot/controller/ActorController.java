package com.prysnail.springboot.controller;

import com.prysnail.springboot.domain.Actor;
import com.prysnail.springboot.service.ActorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 演员Controller
 * @author prysnail
 * @date 2019/12/17 19:10
 */
@Api(tags = "演员信息")
@RestController
public class ActorController {

    @Autowired
    private ActorService actorService;

    @ApiOperation(value = "查询演员信息" , notes = "根据firstName查询演员信息")
    @ApiImplicitParam(name = "firstName" , value = "firstName" , required = true , dataType = "String" , paramType = "query")
    @GetMapping("/api/actor")
    public Actor findByFirstName(@RequestParam String firstName){
        return actorService.findByFirstName(firstName);
    }

    /**
     * 通过actorId查找演员信息
     * @param actorId
     * @return
     */
    @ApiOperation(value = "查询演员信息" , notes = "根据actionId查询演员信息")
    @ApiImplicitParam(name = "actorId" , value = "演员id" , required = true , dataType = "long" , paramType = "path" )
    @RequestMapping(value = "/api/actor/{actorId}" , method = RequestMethod.GET)
    Actor findByActorId(@PathVariable("actorId") Long actorId){
        return actorService.findByActorIdWithCache(actorId);
    }
}
