package com.hasan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hasan.publisher.MsgPublisher;

@SpringBootApplication
public class PublisherApp implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PublisherApp.class, args);
	}

	@Autowired
	private MsgPublisher send;
	
	@Override
	public void run(String... args) throws Exception {
		send.sendMsg("Hello Java");
	}

}
