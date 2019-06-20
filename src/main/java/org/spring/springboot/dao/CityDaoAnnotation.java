package org.spring.springboot.dao;

import org.apache.ibatis.annotations.*;
import org.spring.springboot.entity.City;
import org.springframework.stereotype.Repository;

/**
 * Program:       springboot-mybatis
 * package        org.spring.springboot.dao
 * ClassName:     CityDaoAnnotation
 * Description:   This is  a  class!
 * Date:          Created in  2019/6/12 18:35
 * Author         gaohaijiang
 * Version        V1.0.0
 */
@Mapper // 标志为 Mybatis 的 Mapper
@Repository
public interface CityDaoAnnotation {

    @Select("Select *from city where id=#{id}")
    // 返回 Map 结果集
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "provinceId", column = "province_id"),
            @Result(property = "cityName", column = "city_name"),
            @Result(property = "description", column = "description"),
    })
    public City findById(@Param("id") int id);
}
