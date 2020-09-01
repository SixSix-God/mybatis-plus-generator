package com.ntm.generator.orm.service;

import com.ntm.generator.orm.entity.Country;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;
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
public interface ICountryService extends IService<Country> {

   /**
   * 查询
   *
   * @param model
   * @return
   */
   List<Country> list(Country model);

    /**
    * 分页查询
    *
    * @param model
    * @param pageNum  第几页
    * @param pageSize 每页数量
    * @return
    */
    IPage<Country> pageList(Country model, Integer pageNum, Integer pageSize);

}


