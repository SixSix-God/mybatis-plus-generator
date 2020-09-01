package com.ntm.generator.orm.service.impl;

import com.ntm.generator.orm.entity.User;
import com.ntm.generator.orm.mapper.UserMapper;
import com.ntm.generator.orm.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ntm.generator.util.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * $!{table.comment} 服务实现类
 * </p>
 *
 * @author ntm
 * @since 2020-09-01
 */
@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    public UserMapper userMapper;

    @Override
    public BaseResponse list(User model) {
       QueryWrapper<User> wrapper = new QueryWrapper();
       BaseResponse response = new BaseResponse();
       try{
           response.ok(userMapper.list(model));
           log.info("SUCCESS!");
       }catch (Exception ex)
       {
           response.fail(ex.toString(),userMapper.list(model));
           log.error(ex.toString());
       }
       return response;
    }

    @Override
    public IPage<User> pageList( User model, Integer pageNum, Integer pageSize) {

       QueryWrapper<User> wrapper = new QueryWrapper(model);
       return this.page(new Page<>(pageNum, pageSize), wrapper);
    }


}


