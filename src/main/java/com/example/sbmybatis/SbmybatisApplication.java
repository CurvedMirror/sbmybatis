package com.example.sbmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value ="com.example.sbmybatis.mapper" )
public class SbmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbmybatisApplication.class, args);
    }

}
