package com.hasan.subscriber;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import com.hasan.entity.Actor;

@Service
public class SubscriberApp {
	@JmsListener(destination = "actor")
	public void subscriber(Actor a) {
		IO.println("Message received: ");
		IO.println(a);
	}
}
