package com.ninja.boot.maven_sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


/**
 * Hello world!
 *
 */

@SpringBootApplication
@ComponentScan("com.ninja.boot.*")
@EntityScan(basePackages = {"com.ninja.boot.topic","com.ninja.boot.course"})
@EnableJpaRepositories(basePackages = {"com.ninja.boot.topic","com.ninja.boot.course"})
@EnableAutoConfiguration
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
