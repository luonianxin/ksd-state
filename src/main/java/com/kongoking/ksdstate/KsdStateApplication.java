package com.kongoking.ksdstate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kongoking.ksdstate.mapper")
public class KsdStateApplication {

    public static void main(String[] args) {
        SpringApplication.run(KsdStateApplication.class, args);
    }

}
