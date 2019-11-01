package com.panda.springBootMybatis.controller;

import com.panda.springBootMybatis.entity.City;
import com.panda.springBootMybatis.service.CityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: springBoot-Mybatis
 * @description:
 * @author: jiangzq
 * @create: 2019-11-01 13:47
 **/
@RestController
public class CityController {
    @Resource
    private CityService cityService;

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public List<City> findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        return cityService.findCityByName(cityName);
    }
}
