package com.pb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.social.autoconfigure.SocialWebAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.pb.Config.propertes.MyProperies;
import com.pb.Config.propertes.SecurityProperties;

@SpringBootApplication(exclude = {SocialWebAutoConfiguration.class})
@MapperScan({"com.pb.*.dao"})
@EnableConfigurationProperties({SecurityProperties.class, MyProperies.class})
@EnableCaching
@EnableAsync
@EnableTransactionManagement
public class SpringBootMysysApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMysysApplication.class, args);
	}

}
