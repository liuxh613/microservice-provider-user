package com.lxh.cloud.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


//@EnableDiscoveryClient
@EnableEurekaClient
@MapperScan("com.lxh.cloud.study.mapper")
@SpringBootApplication
public class MicroserviceProviderUserApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProviderUserApplication.class, args);
	}

}
