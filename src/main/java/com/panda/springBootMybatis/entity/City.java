package com.panda.springBootMybatis.entity;

/**
 * @program: springBoot-Mybatis
 * @description:
 * @author: jiangzq
 * @create: 2019-11-01 12:57
 **/
public class City {
    private Long id;                //城市编号
    private Long provinceId;        //省份编号
    private String cityName;
    private String description;

   /* public City() {
        super();
    }

    public City(Long id, Long provinceId, String cityName, String description) {
        this.id = id;
        this.provinceId = provinceId;
        this.cityName = cityName;
        this.description = description;
    }*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
