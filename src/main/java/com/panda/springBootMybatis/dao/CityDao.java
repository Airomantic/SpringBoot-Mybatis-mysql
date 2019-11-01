package com.panda.springBootMybatis.dao;


import com.panda.springBootMybatis.entity.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: springBoot-Mybatis
 * @description:
 * @author: jiangzq
 * @create: 2019-11-01 12:59
 **/
@Mapper           //标志为MyBatis的Mapper
public interface CityDao {
    @Results({//注意这里+s
            @Result(property = "id", column = "id"),
            @Result(property = "provinceId", column = "provinceId"),
            @Result(property = "cityName", column = "cityName"),
            @Result(property = "description", column = "description"),
    })
    @Select("SELECT * FROM city WHERE cityName = #{cityName}")
    List<City> findByName(String cityName);
}
