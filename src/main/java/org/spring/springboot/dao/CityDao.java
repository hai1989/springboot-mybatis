package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.entity.City;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 城市 DAO 接口类
 *
 * Created by bysocket on 07/02/2017.
 */

@Repository
public interface CityDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
   public City findByName(@Param("cityName") String cityName);

   public List<City> findAllByName();

     //增
    @Transactional()
    public  int  addCityInfo(City city);

    //改
    public  int updateById(City city);

    //删
    public  int  deleteByName(@Param("cityName") String cityName);
}
