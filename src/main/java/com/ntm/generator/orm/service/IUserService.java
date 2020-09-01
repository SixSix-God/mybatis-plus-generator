package com.ntm.generator.orm.service;

import com.ntm.generator.orm.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ntm.generator.util.BaseResponse;
import org.springframework.stereotype.Service;

/**
* <p>
    * $!{table.comment} 服务类
    * </p>
*
* @author ntm
* @since 2020-09-01
*/

@Service
public interface IUserService extends IService<User> {

   /**
   * 查询
   *
   * @param model
   * @return
   */
   BaseResponse list(User model);

    /**
    * 分页查询
    *
    * @param model
    * @param pageNum  第几页
    * @param pageSize 每页数量
    * @return
    */
    IPage<User> pageList(User model, Integer pageNum, Integer pageSize);

}


