package com.example.demo;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.WebApplicationInitializer;

@Configuration
//@EnableCaching
@EnableJpaRepositories(basePackages = {"com.example.demo.repository"})
@EntityScan(basePackages = {"com.example.demo.entity"})
@PropertySource({"classpath:application.properties"})
//@ImportResource("classpath:dispatcherServlet-servlet.xml")

@SpringBootApplication
//DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class,
@ComponentScan(basePackages={"com.example.demo"})
@EnableAutoConfiguration(exclude = {

org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class,
org.springframework.boot.actuate.autoconfigure.ManagementWebSecurityAutoConfiguration.class})


public class DemoApplication  extends SpringBootServletInitializer implements WebApplicationInitializer{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	      return builder.sources(DemoApplication.class);
	   }
	
Super ra this is new thing	
	/*
	 @Bean
	    ServletRegistrationBean myServletRegistration () {
	        ServletRegistrationBean srb = new ServletRegistrationBean();
	        srb.setServlet(new StartupServlet());
	        srb.setUrlMappings(Arrays.asList("/path2/*"));
	        srb.setLoadOnStartup(1);
	        return srb;
	    }*/
	
	/*@Bean
    FilterRegistrationBean myFilterRegistration () {
        FilterRegistrationBean frb = new FilterRegistrationBean();
        frb.setFilter(new CSRFFilterBean());
        frb.setUrlPatterns(Arrays.asList("/*"));
        return frb;
    }*/
}
