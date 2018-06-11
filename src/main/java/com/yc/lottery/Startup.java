package com.yc.lottery;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.github.pagehelper.PageHelper;


@SpringBootApplication
/**
 * 
 * Spring Boot提供一个方便的 @SpringBootApplication 
 * 选择该 @SpringBootApplication 注解等价于以默认属性使用 @Configuration， @EnableAutoConfiguration 和 @ComponentScan
 * @author cecsm
 * @version 2018年2月17日
 * @since
 */
public class Startup extends SpringBootServletInitializer
{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Startup.class);
    }
    public static void main(String[] args)
    {
        SpringApplication app = new SpringApplication(Startup.class);
        app.run(args);
    }


}
