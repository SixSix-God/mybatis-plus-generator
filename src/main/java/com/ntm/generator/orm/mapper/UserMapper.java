package com.ntm.generator.orm.mapper;

import com.ntm.generator.orm.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * Spring Boot Demo Orm 系列示例表 Mapper 接口
 * </p>
 *
 * @author ntm
 * @since 2020-09-01
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    List<User> list(User user);

}
