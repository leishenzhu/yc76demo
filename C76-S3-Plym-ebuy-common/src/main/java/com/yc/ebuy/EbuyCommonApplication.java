package com.yc.ebuy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//mybatis的接口组件扫描
@MapperScan("com.yc.ebuy")
public class EbuyCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbuyCommonApplication.class, args);
	}

}
