package com.cdr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy  //包含了@EnableZuulServer,设置该类是网关的启动类
@EnableAutoConfiguration  //可以帮助SpringBoot应用将所有符合条件的 @Configuration配置加载到当前SpringBoot创建并使用的IoC容器中。
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
