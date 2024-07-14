package com.vyku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.vyku.sbeans.Hotel;

@SpringBootApplication
public class SpringBootIoC05SpelApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SpringBootIoC05SpelApplication.class, args);
		Hotel hotel=ctx.getBean("hotel",Hotel.class);
		System.out.println(hotel);
		((ConfigurableApplicationContext) ctx).close();
	
	}

}
