package org.spring.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.spring.springboot.common.Result;
import org.spring.springboot.entity.City;
import org.spring.springboot.service.CityService;
import org.spring.springboot.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by bysocket on 07/02/2017.
 */
@RestController
@Slf4j
public class CityRestController {

    @Autowired
    private CityService cityService;
    @Autowired
    private City city;
    @Autowired
    private JdbcTemplate  jdbcTemplate;

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public Result findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        return ResultUtil.success(cityService.findCityByName(cityName));
    }

    @RequestMapping(value = "/api/cityId", method = RequestMethod.GET)
    public Result findOneCityById(@RequestParam(value = "id", required = true) int id) {
        return ResultUtil.success(cityService.findCityById(id));
    }

    @RequestMapping(value="/api/cities",method = RequestMethod.GET)
    public Result findAllCity(){
        return  ResultUtil.success(cityService.findAllCityByName());
    }

    @RequestMapping(value = "/api/add",method = RequestMethod.GET)
    public Result  addOneCity(int provinceId,String cityName,String description){
        city.setCityName(cityName);
        city.setProvinceId(provinceId);
        city.setDescription(description);
        return  ResultUtil.success("插入数据条数："+cityService.addCityInfos(city));
    }

    @RequestMapping(value = "/api/update",method = RequestMethod.GET)
    public Result updateOneCity(int provinceId,String cityName,String description,int id){
        city.setCityName(cityName);
        city.setProvinceId(provinceId);
        city.setDescription(description);
        city.setId(id);
        return  ResultUtil.success("更新数据条数："+cityService.updateCity(city));
    }

    @RequestMapping(value = "/api/delete",method = RequestMethod.GET)
    public Result  deleteOneCity(String cityName){
        return   ResultUtil.success("删除数据条数："+cityService.deleteCity(cityName));
    }


    @RequestMapping(value = "/api/d",method = RequestMethod.GET)
    public Result  d(){
        String sql= "SELECT * FROM city where id = 3"; //可以配置到yml 然后通过@Value获取
        List<City> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper(City.class));
        log.info(list.toString());
        return   ResultUtil.success(list);
    }
}
