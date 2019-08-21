package com.example.stockspring;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.stockspring.model.IPODetail;

@SpringBootApplication
public class SpringMvcExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcExampleApplication.class, args);
		
		
	}
}
	
	/*
	 * 
		IPODetail ipo=new IPODetail();
		//ipo.setId(11);
		ipo.setCompanycode(3);
		ipo.setStockExchanges("abc");
		ipo.setPrice(4.5);
		ipo.setTotalShares(10);
		ipo.setDateTime(null);
		ipo.setRemarks("good");
	 * 
	 * 
	 * @Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return (args) -> {
			System.out.println("ctx.getBeanDefinitionCount()"+ctx.getBeanDefinitionCount());	
					Arrays.stream(ctx.getBeanDefinitionNames())
					.sorted()
					.forEach(name->System.out.println(name));
		};
		  
		  
	  }*/

