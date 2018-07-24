package com.mr.bom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.mr.bom.dao.mapper")
public class BomApplication {

    public static void main(String[] args) {
        SpringApplication.run(BomApplication.class, args);
    }
}
