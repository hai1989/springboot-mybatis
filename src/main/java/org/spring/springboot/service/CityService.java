package org.spring.springboot.service;

import org.spring.springboot.entity.City;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 城市业务逻辑接口类
 *
 * Created by bysocket on 07/02/2017.
 */
public interface CityService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);

    City findCityById(int id);

    List<City> findAllCityByName();

    //增

    int  addCityInfos(City city);

    //改
    int  updateCity(City city);

    //删除
    int deleteCity(String cityName);
}
