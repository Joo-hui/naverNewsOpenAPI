package com.practice.newstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing  // 시간 자동 변경이 가능하도록 함
@SpringBootApplication  //나 스프링부트다
public class NewstestApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewstestApplication.class, args);
    }

}
