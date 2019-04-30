package com.yangxia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker
public class HiApplication {
	public static void main(String[] args) {
		SpringApplication.run(HiApplication.class, args);
	}

   /*@Bean
   @LoadBalanced
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
   }*/
}
