package com.zhengxin.xhr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.zhengxin.xhr.mapper")
@EnableCaching
public class XhrApplication {

    public static void main(String[] args) {
        SpringApplication.run(XhrApplication.class, args);
    }

}
