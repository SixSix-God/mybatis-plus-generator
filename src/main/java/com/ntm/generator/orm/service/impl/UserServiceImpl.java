package com.ntm.generator.orm.service.impl;

import com.ntm.generator.orm.entity.User;
import com.ntm.generator.orm.mapper.UserMapper;
import com.ntm.generator.orm.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * $!{table.comment} 服务实现类
 * </p>
 *
 * @author ntm
 * @since 2020-09-01
 */

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


    @Override
    public List<User> list(User model) {
       QueryWrapper<User> wrapper = new QueryWrapper();
       return super.list(wrapper);
    }

    @Override
    public IPage<User> pageList( User model, Integer pageNum, Integer pageSize) {

       QueryWrapper<User> wrapper = new QueryWrapper(model);
       return this.page(new Page<>(pageNum, pageSize), wrapper);
    }


}


