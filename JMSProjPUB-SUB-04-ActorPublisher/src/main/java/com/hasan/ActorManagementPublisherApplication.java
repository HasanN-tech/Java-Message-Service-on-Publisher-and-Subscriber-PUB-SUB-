package com.hasan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hasan.entity.Actor;
import com.hasan.publisher.PublisherApp;

@SpringBootApplication
public class ActorManagementPublisherApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ActorManagementPublisherApplication.class, args);
	}

	@Autowired
	private PublisherApp pa;
	
	@Override
	public void run(String... args) throws Exception {
		IO.println(pa.sendMsg(new Actor(111,"Salman Khan",55)));
	}

}
