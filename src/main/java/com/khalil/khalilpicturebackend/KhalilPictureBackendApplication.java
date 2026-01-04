package com.khalil.khalilpicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.khalil.khalilpicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class KhalilPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(KhalilPictureBackendApplication.class, args);
    }

}
