package com.ntm.generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ntm.generator.*.mapper")
public class MybatisPlusGeneratorApplication {


    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusGeneratorApplication.class, args);
    }
}

