package com.ntm.generator.orm.service.impl;

import com.ntm.generator.orm.entity.User;
import com.ntm.generator.orm.mapper.UserMapper;
import com.ntm.generator.orm.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Spring Boot Demo Orm 系列示例表 服务实现类
 * </p>
 *
 * @author ntm
 * @since 2020-08-31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
