package com.panda.springBootMybatis.service.impl;

import com.panda.springBootMybatis.dao.CityDao;
import com.panda.springBootMybatis.entity.City;
import com.panda.springBootMybatis.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: springBoot-Mybatis
 * @description:
 * @author: jiangzq
 * @create: 2019-11-01 13:41
 **/
@Service
public class CityServiceImpl implements CityService{

    @Resource
    private CityDao cityDao;


    public List<City> findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }
}
