package com.mylearning.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {
        "com.mylearning.customer",
        "com.mylearning.amqp"
})
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.mylearning.clients")
public class CustomerApplication {
    public static void main(String[] args){
        SpringApplication.run(CustomerApplication.class,args);
    }
}
