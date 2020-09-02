package com.ntm.generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * @description: 启动类，打成war包继承SpringBootServletInitializer，重写
 *     @Override
 *     protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
 *         return builder.sources(MybatisPlusGeneratorApplication.class);
 *     }
 * @author: Tian
 * @date: 2020-09-02 09:34:13
 * @version: V1.0
 */
@SpringBootApplication
@MapperScan("com.ntm.generator.*.mapper")
public class MybatisPlusGeneratorApplication extends SpringBootServletInitializer {


    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusGeneratorApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MybatisPlusGeneratorApplication.class);
    }
}

