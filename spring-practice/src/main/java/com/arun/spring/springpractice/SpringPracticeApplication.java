package com.arun.spring.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import enterprise.example.web.MyWebController;

@SpringBootApplication
//@ComponentScan("com.arun.spring.springpractice")//This is default. Component scan is done in the package by default where @SpringBootApplication annotation is used
@ComponentScan({ "com.arun.spring.springpractice", "enterprise.example" }) //=> can specify multiple packages as shown
public class SpringPracticeApplication {
	public static void main(String[] args) {
		//		MarioGame mario =new MarioGame();
		//		SuperContraGame superContra =new SuperContraGame();
		//		GameRunner runner =new GameRunner(superContra);
		//		runner.run();

		ConfigurableApplicationContext context = SpringApplication.run(SpringPracticeApplication.class, args);
		//		GameRunner gameRunnerBean = context.getBean(GameRunner.class);
		//		gameRunnerBean.run();
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.getValue());

	}

}
