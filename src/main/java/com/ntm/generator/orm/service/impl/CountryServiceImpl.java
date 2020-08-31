package com.ntm.generator.orm.service.impl;

import com.ntm.generator.orm.entity.Country;
import com.ntm.generator.orm.mapper.CountryMapper;
import com.ntm.generator.orm.service.ICountryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ntm
 * @since 2020-08-31
 */
@Service
public class CountryServiceImpl extends ServiceImpl<CountryMapper, Country> implements ICountryService {

}
