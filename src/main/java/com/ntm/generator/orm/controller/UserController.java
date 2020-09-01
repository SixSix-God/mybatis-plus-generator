package com.ntm.generator.orm.controller;

import com.ntm.generator.orm.entity.User;
import com.ntm.generator.orm.service.IUserService ;
import com.ntm.generator.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.core.metadata.IPage;


/**
* $!{table.comment} 前端控制器
* @author ntm
* @since 2020-09-01
*/


@RestController
@RequestMapping("/user" )
public class UserController {

    @Autowired
    private IUserService  userService;

    /**
    * 保存
    *
    * @param model
    * @return
    */
    @RequestMapping("/save")
    public Object save(User model) {
        userService.save(model);
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
     User model = userService.getById(id);
        // todo 再包装一层
        return model;
    }


    /**
    * 列表查询（非分页）
    *
    * @return
    */
    @RequestMapping("/list")
    public BaseResponse list() {
        User model = new  User();
        return userService.list(model);
    }


    /**
    * 列表查询（分页）
    *
    * @return
    */
    @RequestMapping("/pageList")
    public Object pageList(Integer pageNum, Integer pageSize) {

        User model = new  User();
        IPage<User> page = userService.pageList(model, pageNum, pageSize);
        // todo 再包装一层
        return page;
    }

}

