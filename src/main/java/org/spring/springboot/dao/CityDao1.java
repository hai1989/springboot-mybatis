package org.spring.springboot.dao;

import org.apache.ibatis.annotations.*;
import org.spring.springboot.entity.City;

/**
 * Program:       springboot-mybatis
 * package        org.spring.springboot.dao
 * ClassName:     CityDao1
 * Description:   This is  a  class!
 * Date:          Created in  2019/6/19 12:45
 * Author         gaohaijiang
 * Version        V1.0.0
 */
@Mapper
public interface CityDao1 {

    @Select("select *from city where city_name=#{cityName}")
    // 返回 Map 结果集
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "provinceId",column ="province_id" ),
            @Result(property = "cityName",column = "city_name"),
            @Result(property = "description",column = "description"),
    })


    City findByName1(@Param("cityName") String cityName);

}
