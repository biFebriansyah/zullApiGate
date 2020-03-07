package com.learn.apizull.zullapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZullApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZullApiApplication.class, args);
	}
}
