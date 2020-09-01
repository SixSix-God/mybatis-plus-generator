package com.ntm.generator.orm.service.impl;

import com.ntm.generator.orm.entity.Country;
import com.ntm.generator.orm.mapper.CountryMapper;
import com.ntm.generator.orm.service.ICountryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;

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
public class CountryServiceImpl extends ServiceImpl<CountryMapper, Country> implements ICountryService {


    @Override
    public List<Country> list(Country model) {
       QueryWrapper<Country> wrapper = new QueryWrapper();
       return super.list(wrapper);
    }

    @Override
    public IPage<Country> pageList( Country model, Integer pageNum, Integer pageSize) {

       QueryWrapper<Country> wrapper = new QueryWrapper(model);
       return this.page(new Page<>(pageNum, pageSize), wrapper);
    }


}


