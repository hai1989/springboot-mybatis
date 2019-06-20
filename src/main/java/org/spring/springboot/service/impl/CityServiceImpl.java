package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CityDao;
import org.spring.springboot.dao.CityDaoAnnotation;
import org.spring.springboot.entity.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao  cityDao;
    @Autowired
    private CityDaoAnnotation  cityDaoAnnotation;

    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

    @Override
    public City findCityById(int id) {
        return cityDaoAnnotation.findById(id);
    }

    @Override
    public List<City> findAllCityByName() {
        return cityDao.findAllByName();
    }

    @Override
    @Transactional
    public int addCityInfos(City city) {
        if(city.getProvinceId()==5){
            System.out.println("sdfd");
            throw new IllegalArgumentException("数据已存在，回滚");
        }
        return cityDao.addCityInfo(city);
    }

    @Override
    public int updateCity(City city) {
        return cityDao.updateById(city);
    }

    @Override
    public int deleteCity(String cityName) {
        return cityDao.deleteByName(cityName);
    }

}
