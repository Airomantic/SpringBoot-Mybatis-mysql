package com.panda.springBootMybatis.service;

import com.panda.springBootMybatis.entity.City;

import java.util.List;

/**
 * @program: springBoot-Mybatis
 * @description:
 * @author: jiangzq
 * @create: 2019-11-01 13:40
 **/
public interface CityService {
    List<City> findCityByName(String cityName);
}
