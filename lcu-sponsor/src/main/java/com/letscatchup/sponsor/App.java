package com.letscatchup.sponsor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.letscatchup.core.BaseApp;

@SpringBootApplication
public class App extends BaseApp {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
