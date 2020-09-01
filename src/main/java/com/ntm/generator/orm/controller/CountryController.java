package com.ntm.generator.orm.controller;

import com.ntm.generator.orm.entity.Country;
import com.ntm.generator.orm.service.ICountryService ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;


/**
* $!{table.comment} 前端控制器
* @author ntm
* @since 2020-09-01
*/


@RestController
@RequestMapping("/country" )
public class CountryController {

    @Autowired
    private ICountryService  countryService;

    /**
    * 保存
    *
    * @param model
    * @return
    */
    @RequestMapping("/save")
    public Object save(Country model) {
        countryService.save(model);
        return "success";
    }


    /**
    * 查询详情
    *
    * @param id
    * @return
    */
    @RequestMapping("/getById")
    public Object getById(Integer id) {
     Country model = countryService.getById(id);
        // todo 再包装一层
        return model;
    }


    /**
    * 列表查询（非分页）
    *
    * @return
    */
    @RequestMapping("/list")
    public Object list() {
        Country model = new  Country();
        List<Country> list =  countryService.list(model);
        // todo 再包装一层
        return list;
    }


    /**
    * 列表查询（分页）
    *
    * @return
    */
    @RequestMapping("/pageList")
    public Object pageList(Integer pageNum, Integer pageSize) {

        Country model = new  Country();
        IPage<Country> page = countryService.pageList(model, pageNum, pageSize);
        // todo 再包装一层
        return page;
    }

}

